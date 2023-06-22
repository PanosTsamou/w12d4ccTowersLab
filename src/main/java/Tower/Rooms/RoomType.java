package Tower.Rooms;

public enum RoomType {
    SINGLE(1, 50.00),
    DOUBLE(2, 80.00);


    private int capacity;
    private double nightlyRate;

    RoomType(int capacity, double nightlyRate){

        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
