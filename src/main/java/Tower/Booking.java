package Tower;

import Tower.Rooms.Bedroom;
import Tower.Rooms.Room;

public class Booking {

    private Bedroom bedroom;
    private int numberOfDays;

    public Booking(Bedroom bedroom, int numberOfDays){
        this.bedroom = bedroom;
        this.numberOfDays = numberOfDays;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getBill() {
        return (this.bedroom.getNightlyRate() * this.numberOfDays);
    }
}
