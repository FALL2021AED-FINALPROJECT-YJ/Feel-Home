package model.services;

import java.util.ArrayList;
import java.util.List;
import model.Hotel;
import model.RoomList;

public class HotelService extends Service {

    public static enum HotelServiceType {
        LAUNDARY(10),
        TRANSPORTATION(20);

        private final int price;

        private HotelServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

    }

    private RoomList roomlist;
    private List<HotelServiceType> hotelServices;

    public HotelService(Hotel hotel) {
        super(hotel, Service.ServiceType.HOTEL, null);
        this.hotelServices = new ArrayList<>();
        this.roomlist = new RoomList();
    }

    public List<HotelServiceType> getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(List<HotelServiceType> hotelServices) {
        this.hotelServices = hotelServices;
    }

    public RoomList getRoomlist() {
        return roomlist;
    }

    public void setRoomlist(RoomList roomlist) {
        this.roomlist = roomlist;
    }

    public void addService(HotelService.HotelServiceType type) {
        hotelServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nHotel service details:");
        sb.append("\n").append(TAB).append("Hotel: ").append(enterprise);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        sb.append("\n").append(TAB).append("Below are the details of services included for your appointment:");
        for (HotelService.HotelServiceType service : hotelServices) {
            sb.append("\n").append(TAB).append(TAB)
                    .append(String.format("Service type: %s, Cost: %d", service.toString(), service.getPrice()));
        }
        sb.append("\n").append(TAB).append("Total cost: ").append(totalCost);
        return sb.toString();
    }

}
