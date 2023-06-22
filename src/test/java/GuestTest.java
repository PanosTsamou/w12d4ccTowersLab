import org.junit.Before;
import org.junit.Test;
import Guest.Guest;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Jeremy");
    }

    @Test
    public void guestHasName(){
        assertEquals("Jeremy", guest.getName());
    }
}
