package Tower.Rooms;

public class ConferenceRoom extends Room{

    private String name;
    private int capacity;

    public ConferenceRoom(int capacity, String name){
        super();
        this.capacity = capacity;
        this.name = name;

    }

    @Override
    public int getCapacity() {
        return capacity;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
