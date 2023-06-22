package Tower.Rooms;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;

    public Bedroom(int capacity, int roomNumber){
        super(capacity);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
