package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {

    private Date checkin;
    private Date checkout;
    private String status;
    private int price;
    private Services services;
    private Hotel hotel;
    private List<Room> rooms;

    public Booking(Hotel hotel) {
        services = new Services();
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    
    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
