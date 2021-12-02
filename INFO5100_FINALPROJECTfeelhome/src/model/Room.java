package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {

    private static class BookingDate {

        long startDate;
        int numerOfDays;
    }

    private List<BookingDate> bookings = new ArrayList<>();

    private String price;
    private String roomNo;
    private static int count;
    private static String available = "Available";
    private String status;

    public Room() {
        this.status = available;
        this.roomNo = "RoomNo" + String.valueOf(count + 1);
        count++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomId) {
        this.roomNo = roomId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailable(Date startDate, Date endEnd) {
        return true;
    }
}
