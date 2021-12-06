package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Room {

    private static class BookingDate implements Comparable<BookingDate> {

        private final long startDate;
        private final long endDate;

        BookingDate(Date start, Date end) {
            this.startDate = start.getTime();
            this.endDate = end.getTime();
        }

        @Override
        public int compareTo(BookingDate other) {
            return (int) (this.startDate - ((BookingDate) other).startDate);
        }

        @Override
        public String toString() {
            return "BookingDate{" + "startDate=" + startDate + ", endDate=" + endDate + '}';
        }
    }

    public enum RoomType {
        REGULAR(50, "Regular"),
        DELUXE(100, "Deluxe"),
        SUPER_DELUXE(200, "Super Deluxe");

        private int rate;
        private String name;

        private RoomType(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName();
        }
    }

    private List<BookingDate> bookings = new ArrayList<>();
    private String price;
    private RoomType roomType;
    private String roomNo;
    private static int count;
    private String status;

    public Room(RoomType roomType) {

        this.roomType = roomType;
    }

    public List<BookingDate> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingDate> bookings) {
        this.bookings = bookings;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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

    public boolean isAvailable(Date startDate, Date endDate) {
        BookingDate newBooking = new BookingDate(startDate, endDate);

        for (int i = 0; i < bookings.size(); i++) {
            BookingDate existingBooking = bookings.get(i);
            if (existingBooking.startDate > newBooking.startDate) {
                // booking found on same day, not available
                return false;
            }
            if (existingBooking.startDate > newBooking.startDate) {
                if (existingBooking.startDate <= existingBooking.endDate) {
                    // overlapping dates, not available
                    return false;
                }
                if (i == 0) {
                    // no previous bookings to compare
                    return true;
                } else {
                    BookingDate previousBooking = bookings.get(i - 1);
                    return previousBooking.endDate < existingBooking.startDate;
                }
            }
        }
        return true;
    }

    public void book(Date startDate, Date endDate) {
        if (isAvailable(startDate, endDate)) {
            bookings.add(new BookingDate(startDate, endDate));
            Collections.sort(bookings);
        } else {
            throw new IllegalArgumentException("Room not available");
        }
    }

    public String toString() {
        return "Room:{" + roomNo + ", Bookings " + bookings + "}";
    }
}
