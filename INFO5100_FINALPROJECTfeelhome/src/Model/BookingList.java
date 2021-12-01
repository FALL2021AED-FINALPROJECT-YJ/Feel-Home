package model;

import java.util.ArrayList;
import java.util.List;

public class BookingList {
    List<Booking> listOfBooking;
    
    public BookingList(){
        listOfBooking = new ArrayList<>();
    }

    public List<Booking> getListOfBooking() {
        return listOfBooking;
    }

    public void setListOfBooking(List<Booking> listOfBooking) {
        this.listOfBooking = listOfBooking;
    }
}
