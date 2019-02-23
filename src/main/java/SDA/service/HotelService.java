package SDA.service;

import SDA.model.Hotel;
import SDA.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelService {

    private Hotel hotel;

    public HotelService(Hotel hotel) {
        this.hotel = Objects.requireNonNull(hotel, "Hotel must be defined");
    }

    public List<Room> getAllRooms() {
        return hotel.getRooms();
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : hotel.getRooms()) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }


    private List<Room> getUnavailableRooms() {
        List<Room> unavailableRooms = new ArrayList<>();
        for (Room room : hotel.getRooms()) {
            if (!room.isAvailable()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }

    public void  bookRoom (int roomNumber){

        for (Room room : getAvailableRooms())
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(false);
            }
    }

    public void  releaseRoom (int roomNumber){

        for (Room room : getUnavailableRooms())
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(true);
                break;
            }
    }

}
