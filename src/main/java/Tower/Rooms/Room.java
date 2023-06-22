package Tower.Rooms;
import Guest.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (this.guests.size() < this.capacity){
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
}
