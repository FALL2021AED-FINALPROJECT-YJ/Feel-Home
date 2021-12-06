package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Booking {

    private Date checkin;
    private Date checkout;
    private String status;
    private int price;
    private Services services;
    
    private Hotel hotel;
    private RoomList roomlist;
    private String id;

    public Booking(Hotel hotel) {
        services = new Services();
        this.hotel = hotel;
        roomlist = new RoomList();
        id = UUID.randomUUID().toString();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public RoomList getRoomlist() {
        return roomlist;
    }

    public void setRoomlist(RoomList roomlist) {
        this.roomlist = roomlist;
    }

    public String getId() {
        return id;
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
