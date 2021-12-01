
package model;

import java.util.ArrayList;
import java.util.List;

public class HotelDirectory {
    List<Hotel> listOfHotels;
    
    public HotelDirectory(){
        listOfHotels = new ArrayList<>();
    }

    public List<Hotel> getListOHotels() {
        return listOfHotels;
    }

    public void setListOHotels(List<Hotel> listOfHotels) {
        this.listOfHotels = listOfHotels;
    }
    public Hotel addHotel(){
        Hotel hotel = new Hotel ();
        listOfHotels.add(hotel);
        return hotel;
    }
    
}
