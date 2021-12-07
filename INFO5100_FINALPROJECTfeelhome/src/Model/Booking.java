package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import model.service.Service;

public class Booking {

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;

    private List<Service> services;

    private Hotel hotel;
    private RoomList roomlist;
    private String id;

    public Booking(Hotel hotel) {
        this.services = new ArrayList<>();
        this.hotel = hotel;
        this.roomlist = new RoomList();
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        this.services.add(service);
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
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Below are your booking details - ");
        for (Service service : services) {
            sb.append(service).append("\n");
        }
        return sb.toString();
    }
}
