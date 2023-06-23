package Tower.Rooms;
import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;

    public Room(){
        this.guests = new ArrayList<>();
    }

    public abstract int getCapacity();

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.guests.size() < getCapacity()){
            this.guests.add(guest);
        }

    }

    public ArrayList<String> getListOfNamesOfGuestsInRoom(){
        ArrayList<String> guestNames = new ArrayList<>();
        for (Guest guest:this.guests){
            guestNames.add(guest.getName());
        }
        return guestNames;
    }

    public void removeGuest(Guest guest) {
        if (this.guests.contains(guest)){
            this.guests.remove(guest);
        }
    }

    public  abstract String getName();

    public static double calculateRoomSize(double length, double width){
        return length * width;
    }
    public boolean occupied() {
        if (getNumberOfGuests() > 0){
            return true;
        }
        return false;
    }
}
