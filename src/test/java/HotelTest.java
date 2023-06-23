import Tower.Booking;
import Tower.Hotel;
import Tower.Rooms.Bedroom;
import Tower.Rooms.ConferenceRoom;
import Tower.Rooms.DiningRoom;
import Tower.Rooms.RoomType;
import Guest.Guest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel codeClanTower;

    private Bedroom bedroom101;
    private Bedroom bedroom102;
    private Bedroom bedroom103;
    private Bedroom bedroom104;
    private Bedroom bedroom105;
    private ConferenceRoom diamondCRoom;
    private ConferenceRoom sirBeckhamCRoom;

    private DiningRoom pork;
    private DiningRoom shellFish;
    private DiningRoom beef;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void before(){
        bedroom101 = new Bedroom(RoomType.SINGLE, "101", 50.00);
        bedroom102 = new Bedroom(RoomType.DOUBLE, "102", 80.00);
        bedroom103 = new Bedroom(RoomType.SINGLE, "103", 50.00);
        bedroom104 = new Bedroom(RoomType.SINGLE, "104", 70.00);
        bedroom105 = new Bedroom(RoomType.SINGLE, "105", 50.00);
        diamondCRoom = new ConferenceRoom(12, "Diamond Room");
        sirBeckhamCRoom = new ConferenceRoom(20, "Sir Beckham");
        pork = new DiningRoom("Pork", 8);
        shellFish = new DiningRoom("Shellfish", 5);
        beef = new DiningRoom("Beef", 10);
        ArrayList<Bedroom> allBedrooms = new ArrayList<>();
        ArrayList<ConferenceRoom> allConferenceRooms = new ArrayList<>();
        HashMap<String, DiningRoom> allDiningRooms = new HashMap<>();
        allBedrooms.add(bedroom101);
        allBedrooms.add(bedroom102);
        allBedrooms.add(bedroom103);
        allBedrooms.add(bedroom104);
        allConferenceRooms.add(diamondCRoom);
        allConferenceRooms.add(sirBeckhamCRoom);
        allDiningRooms.put(pork.getName(), pork);
        allDiningRooms.put(shellFish.getName(),shellFish);
        allDiningRooms.put(beef.getName(), beef);
        codeClanTower = new Hotel(allBedrooms, allConferenceRooms, allDiningRooms);
        guest1 = new Guest("Panos");
        guest2 = new Guest("Alex");
        guest3 = new Guest("Sobia");
    }

    @Test
    public void hotelHasBedrooms(){
        assertEquals(4, codeClanTower.getNumberOfBedrooms());
    }
    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(2, codeClanTower.getNumberOfConferenceRooms());
    }

    @Test
    public void hotelCanCheckInGuestToRoom_hasCapacity(){
        codeClanTower.checkInGuestToRoom(bedroom101, guest1);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(guest1.getName());
        assertEquals(1, bedroom101.getNumberOfGuests());
        assertEquals(expected, bedroom101.getListOfNamesOfGuestsInRoom());
    }
    @Test
    public void hotelCanCheckInGuestToRoom_lacksCapacity(){
        codeClanTower.checkInGuestToRoom(bedroom101, guest1);
        codeClanTower.checkInGuestToRoom(bedroom101, guest2);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(guest1.getName());
        assertEquals(1, bedroom101.getNumberOfGuests());
        assertEquals(expected, bedroom101.getListOfNamesOfGuestsInRoom());
    }
    @Test
    public void hotelCanCheckInGuestToRoom_roomNotInHotel(){
        codeClanTower.checkInGuestToRoom(bedroom105, guest1);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(0, bedroom101.getNumberOfGuests());
        assertEquals(expected, bedroom101.getListOfNamesOfGuestsInRoom());
    }

    @Test
    public void hotelCanCheckGuestOutOfRoom(){
        codeClanTower.checkInGuestToRoom(bedroom101, guest1);
        codeClanTower.checkOUtGuestFromRoom(bedroom101, guest1);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(0, bedroom101.getNumberOfGuests());
        assertEquals(expected, bedroom101.getListOfNamesOfGuestsInRoom());
    }

    @Test
    public void hotelCanBookGuestToRoom(){
        Booking expected = new Booking(bedroom101 , 7);
        Booking actual = codeClanTower.bookRoom(bedroom101, 7);
        assertEquals(expected.getBedroom(), actual.getBedroom());
        assertEquals(expected.getNumberOfDays(), actual.getNumberOfDays());
    }
    @Test
    public void hotelHasDiningRoom(){
        assertEquals(3, codeClanTower.getNumberOfDiningRooms());
    }

    @Test
    public void emptyBedroomsInHotel(){
        codeClanTower.checkInGuestToRoom(bedroom101, guest1);
        codeClanTower.checkInGuestToRoom(bedroom102, guest2);
        codeClanTower.checkInGuestToRoom(bedroom102, guest3);
        ArrayList<Bedroom> expected = new ArrayList<>();
        expected.add(bedroom103);
        expected.add(bedroom104);
        assertEquals(expected, codeClanTower.getEmptyRoom());
    }

}
