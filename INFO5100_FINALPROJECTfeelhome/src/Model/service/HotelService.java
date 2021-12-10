package model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Hotel;
import static model.service.Service.TAB;

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
    private List<HotelServiceType> hotelServices;

    public HotelService(Hotel hotel, Date date) {
        super(hotel, Service.ServiceType.HOTEL, date);
        this.hotelServices = new ArrayList<>();
    }

    public List<HotelServiceType> getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(List<HotelServiceType> hotelServices) {
        this.hotelServices = hotelServices;
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
