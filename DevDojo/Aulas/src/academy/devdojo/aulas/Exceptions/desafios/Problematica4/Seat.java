package academy.devdojo.aulas.Exceptions.desafios.Problematica4;

public class Seat {
    private boolean isOccupied;
    private char row;
    private int column;

    public Seat(char a, int b) {
        this.isOccupied = false;
        this.row = a;
        this.column = b;
    }

    @Override
    public String toString() {
        return "Seat " + row + column;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
