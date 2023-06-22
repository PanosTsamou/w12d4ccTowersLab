package Tower;

import Guest.Guest;
import Tower.Rooms.Bedroom;
import Tower.Rooms.ConferenceRoom;
import Tower.Rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> allBedrooms;
    private ArrayList<ConferenceRoom> allConferenceRooms;

    public Hotel(ArrayList<Bedroom> allBedrooms, ArrayList<ConferenceRoom> allConferenceRooms){
        this.allBedrooms = allBedrooms;
        this.allConferenceRooms = allConferenceRooms;
    }


    public int getNumberOfBedrooms() {
        return this.allBedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return this.allConferenceRooms.size();
    }


    public void checkInGuestToRoom(Room room, Guest guest) {
        if (this.allBedrooms.contains(room) || this.allConferenceRooms.contains(room)){
            room.addGuest(guest);
        }
    }

    public void checkOUtGuestFromRoom(Room room, Guest guest) {
        if (this.allBedrooms.contains(room) || this.allConferenceRooms.contains(room)){
            room.removeGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfDays) {
        Booking newBooking = new Booking(bedroom, numberOfDays);
        return newBooking;
    }
}
