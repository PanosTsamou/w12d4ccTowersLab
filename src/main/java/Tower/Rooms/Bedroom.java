package Tower.Rooms;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(RoomType roomType, int roomNumber){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightlyRate() {
        return this.roomType.getNightlyRate();
    }
}
