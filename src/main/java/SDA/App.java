package SDA;

import SDA.model.Hotel;
import SDA.service.HotelService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Hotel sdaHotel = new Hotel();

        HotelService sdaHotelService = new HotelService(sdaHotel);
        System.out.println("All Rooms ");
        System.out.println(sdaHotelService.getAllRooms());
        System.out.println("All available Rooms ");
        System.out.println(sdaHotelService.getAvailableRooms());

        sdaHotelService.bookRoom(11);
        System.out.println(sdaHotelService.getAvailableRooms());

        sdaHotelService.releaseRoom(11);
        System.out.println(sdaHotelService.getAvailableRooms());
    }
}
