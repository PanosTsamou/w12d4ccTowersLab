package Tower.Rooms;

public class Bedroom extends Room{

    private String roomNumber;
    private RoomType roomType;
    private  double nightlyRate;

    public Bedroom(RoomType roomType, String roomNumber, double nightlyRate){
        super();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }



    public double getNightlyRate() {
        return this.nightlyRate;
    }

    @Override
    public int getCapacity() {
        return roomType.getCapacity();
    }

    @Override
    public String getName() {
        return roomNumber;
    }


}
