package Tower.Rooms;

public class DiningRoom extends Room{

    private  String name;
    private  int capacity;

    public DiningRoom(String name, int capacity){
        super();
        this.name = name;
        this.capacity = capacity;
    }
    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getName() {
        return name;
    }

}
