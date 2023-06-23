package Tower;

import Guest.Guest;
import Tower.Rooms.Bedroom;
import Tower.Rooms.ConferenceRoom;
import Tower.Rooms.DiningRoom;
import Tower.Rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> allBedrooms;
    private ArrayList<ConferenceRoom> allConferenceRooms;

    private HashMap<String, DiningRoom> allDiningRooms;

    public Hotel(ArrayList<Bedroom> allBedrooms, ArrayList<ConferenceRoom> allConferenceRooms, HashMap<String, DiningRoom> allDiningRooms){
        this.allBedrooms = allBedrooms;
        this.allConferenceRooms = allConferenceRooms;
        this.allDiningRooms = allDiningRooms;
    }


    public int getNumberOfBedrooms() {
        return this.allBedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.allConferenceRooms.size();
    }

    public int getNumberOfDiningRooms(){
        return this.allDiningRooms.size();
    }


    public void checkInGuestToRoom(Room room, Guest guest) {
        if (this.allBedrooms.contains(room)){
            if (!room.occupied()){
                room.addGuest(guest);
            }
        } else if ( this.allConferenceRooms.contains(room) || this.allDiningRooms.containsValue(room)) {
            room.addGuest(guest);
        }
    }

    public void checkOUtGuestFromRoom(Room room, Guest guest) {
        if (this.allBedrooms.contains(room) || this.allConferenceRooms.contains(room) || this.allDiningRooms.containsValue(room)){
            room.removeGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfDays) {
        Booking newBooking = new Booking(bedroom, numberOfDays);
        return newBooking;
    }

    public ArrayList<Bedroom> getEmptyRoom() {
        ArrayList<Bedroom> emptyRooms = new ArrayList<>();
        for (Bedroom room: allBedrooms){
            if(!room.occupied()){
                emptyRooms.add(room);
            }
        }
        return emptyRooms;
    }
}
