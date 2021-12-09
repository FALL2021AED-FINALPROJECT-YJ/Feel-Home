package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import model.service.Service;

public class Booking {

    private static final String TAB = "      ";
    
    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private Network network;

    private List<Service> services;

    private Hotel hotel;
    private RoomList roomlist;
    private String id;

    public Booking(Hotel hotel, Network network) {
        this.services = new ArrayList<>();
        this.hotel = hotel;
        this.network = network;
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

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Below are your booking details -\n");
        sb.append("\n").append("Hotel booking details are as follows:");
        sb.append("\n").append(TAB).append("Hotel Name: ").append(hotel.getName());
        sb.append("\n").append(TAB).append("City: ").append(network.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);

        List<Room> listOfRooms = roomlist.getListOfRooms();
        int hotelCost = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d rooms booked:", listOfRooms.size()));
        for (Room room : listOfRooms) {
            hotelCost += room.getRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("Room number: ")
                    .append(room.getRoomNo()).append(", Room type: ").append(room.getRoomType());
        }
        sb.append("\n").append(TAB).append("Total cost for your stay: ").append(hotelCost);
        for (Service service : services) {
            sb.append("\n").append(service).append("\n");
        }
        return sb.toString();
    }
}
