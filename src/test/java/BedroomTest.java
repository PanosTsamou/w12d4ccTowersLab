import Tower.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Guest.Guest;
import Tower.Rooms.Bedroom;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE.getCapacity(), 101);
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
        assertEquals(101, bedroom.getRoomNumber());
    }
}
