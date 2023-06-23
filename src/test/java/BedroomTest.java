import Tower.Rooms.Room;
import Tower.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Guest.Guest;
import Tower.Rooms.Bedroom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, "101", 50.00);
        guest1 = new Guest("Panos");
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasEmptyListOfGuests(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void bedroomHasRoomNumber() {
        assertEquals("101", bedroom.getName());
    }

    @Test
    public void bedroomCanAddGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }
    @Test
    public void bedroomHasListOfGuestNames(){
        bedroom.addGuest(guest1);
        ArrayList<String> expected = new ArrayList<>();
        expected.add(guest1.getName());
        assertEquals(expected, bedroom.getListOfNamesOfGuestsInRoom());
    }

    @Test
    public void bedroomCanRemoveGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void bedroomHasNightlyRate(){
        assertEquals(50.00, bedroom.getNightlyRate(), 0.0);
    }

    @Test
    public void calculateBedroomSize(){
        assertEquals(22.00, Room.calculateRoomSize(4,5.5),.0);
    }
}
