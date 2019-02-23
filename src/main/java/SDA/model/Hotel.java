package SDA.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

private List<Room> rooms = new ArrayList<>();

    public Hotel(){
        rooms.add(new Room(10,2,true,false));
        rooms.add(new Room(11,1,false,true));
        rooms.add(new Room(12,6,true,true));
        rooms.add(new Room(13,4,true,true));
        rooms.add(new Room(14,2,false,true));
        rooms.add(new Room(15,1,true,false));
        rooms.add(new Room(16,3,false,true));
        rooms.add(new Room(17,4,false,false));
        rooms.add(new Room(18,5,true,false));
        rooms.add(new Room(19,2,true,true));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
