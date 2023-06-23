import Tower.Rooms.DiningRoom;
import Tower.Rooms.Room;
import Tower.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Guest.Guest;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class DiningRoomTest {
    private  Room diningRoom;
    private Guest guest1;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Pork", 14);
        guest1 = new Guest("Panos");
    }

    @Test
    public void  hasName(){
        assertEquals("Pork", diningRoom.getName());
    }

    @Test
    public void  hasCapacity(){
        assertEquals(14, diningRoom.getCapacity());
    }
    @Test
    public  void  hasGuest(){
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.getNumberOfGuests());
    }

    @Test
    public void calculateDiningroomSize(){
        assertEquals(30.00, Room.calculateRoomSize(5,6),.0);
    }
}
