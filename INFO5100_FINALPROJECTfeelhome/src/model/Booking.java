package model;

import java.util.Date;

public class Booking {
    private Date checkin;
    private Date checkout;
    private String status;
    private Room room;
    private Services services;
    private HotelDirectory hotelDirec;
    
    public Booking() {
        services = new Services();
        hotelDirec = new HotelDirectory();
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public HotelDirectory getHotelDirec() {
        return hotelDirec;
    }

    public void setHotelDirec(HotelDirectory hotelDirec) {
        this.hotelDirec = hotelDirec;
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
