import Tower.Rooms.ConferenceRoom;
import Tower.Rooms.Room;
import Tower.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Tower.Rooms.ConferenceRoom;
import Guest.Guest;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(12, "The Diamond Room");
        guest1 = new Guest("Panos");
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(12, conferenceRoom.getCapacity());

    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("The Diamond Room", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomCanAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }
    @Test
    public void conferenceRoomListOfGuestNames(){
        conferenceRoom.addGuest(guest1);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(guest1.getName());
        assertEquals(expected, conferenceRoom.getListOfNamesOfGuestsInRoom());
    }

    @Test
    public void conferenceRoomCanRemoveGuest(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }
    @Test
    public void calculateConferenceRoomSize(){
        assertEquals(84.00, Room.calculateRoomSize(8,10.5),.0);
    }
}
