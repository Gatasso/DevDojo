package academy.devdojo.aulas.Exceptions.desafios.Problematica4;

public class Plane {
    public Seat[] seatPosition;
    private int column, lines, aisle;
    private final int MAX_CAPACITY;

    public Plane(int column, int lines, int aisle) {
        this.column = column;
        this.lines = lines;
        this.aisle = aisle;
        this.MAX_CAPACITY = (this.column * this.lines * this.aisle);
        this.seatPosition = new Seat[this.MAX_CAPACITY];
        createSeats();
    }

    private void createSeats() {
        int x = 0;
        char row = 'A';
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j <= this.aisle; j++) {
                for (int k = 0; k <= this.column; k++) {
                    if (x < MAX_CAPACITY) {
                        this.seatPosition[x] = new Seat(row, k + 1);
                        x++;
                    }
                }
                row++;
            }
        }
    }
    public Seat findSeat(String seatName){
        for (Seat seat : seatPosition) {
            if (seat!=null && seatName.equals(seat.toString())){
                return seat;
            }
        } return null;
    }
}
