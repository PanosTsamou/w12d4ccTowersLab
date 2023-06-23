import Tower.Booking;
import Tower.Rooms.Bedroom;
import Tower.Rooms.ConferenceRoom;
import Tower.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import Tower.Rooms.ConferenceRoom;
import Guest.Guest;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom101;
    private Bedroom bedroom102;

    @Before
    public void before(){
        bedroom101 = new Bedroom(RoomType.SINGLE, "101", 50.00);
        bedroom102 = new Bedroom(RoomType.DOUBLE, "102", 80.00);
        booking = new Booking(bedroom101, 3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(bedroom101, booking.getBedroom());
    }
    @Test
    public void bookingHasNumberOfDays(){
        assertEquals(3, booking.getNumberOfDays());
    }

    @Test
    public void bookingCanReturnBill(){
        assertEquals(150.00, booking.getBill(), 0.0);
    }

}
