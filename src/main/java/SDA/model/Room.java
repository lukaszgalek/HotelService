package SDA.model;

public class Room {
    private  int roomNumber;
    private int numberOfGuests;
    private boolean bathroom;
    private boolean available;


    public Room(int roomNumber,
                int numberOfGuests,
                boolean bathroom,
                boolean available) {
        this.roomNumber = roomNumber;
        this.numberOfGuests = numberOfGuests;
        this.bathroom = bathroom;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return "\n"+"Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfGuests=" + numberOfGuests +
                ", bathroom=" + bathroom +
                ", available=" + available +
                '}' ;
    }
}
