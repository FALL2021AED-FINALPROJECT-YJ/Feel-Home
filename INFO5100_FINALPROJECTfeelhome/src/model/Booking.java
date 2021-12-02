package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {
    private Date checkin;
    private Date checkout;
    private String status;
    private int  price;
    private Room room;
    private Services services;
    private List<Hotel> listOfHotel;
    
    public Booking() {
        services = new Services();
      listOfHotel = new ArrayList<>();
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public List<Hotel> getListOfHotel() {
        return listOfHotel;
    }

    public void setListOfHotel(List<Hotel> listOfHotel) {
        this.listOfHotel = listOfHotel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
      
}
