package academy.devdojo.aulas.Exceptions.desafios.Problematica4;

import java.util.Scanner;

public class PlaneInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plane plane = new Plane(3, 10, 3);
        try {
            System.out.println("Choose the seat on the plane");
            String choice = scanner.nextLine();
            Seat chosenSeat = plane.findSeat(choice);
            setSeatReservation(chosenSeat);
        }catch (UnavailableSeatException e){
            e.printStackTrace();
            System.out.println("Unavailable Seat. Please choose another one");
        }
    }
    private static void setSeatReservation(Seat chosenSeat) throws UnavailableSeatException{
        if(chosenSeat.isOccupied()) {
            throw new UnavailableSeatException();
        }else {
            System.out.println("Reservation confirmed on " + chosenSeat);
            chosenSeat.setOccupied(true);
        }
    }
}
