package model.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.Restaurant;

public class RestaurantService extends Service {

    private String menuItem;
    private Restaurant res;

    public RestaurantService(Restaurant res, Date eventDate, String menuItem, int cost) {
        super(Service.ServiceType.RESTURANT, eventDate);
        this.menuItem = menuItem;
        super.totalCost = cost;
        this.res = res;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("\nRestaurant order details - ");
        sb.append("\n\tRestaurant name - ").append(res.getName());
        sb.append("\n\tOrder item - ").append(menuItem);
        sb.append("\n\tTotal cost - ").append(totalCost);
        sb.append("\n\tDate of order - ").append(getDate());
        sb.append("\n\tStatus - ").append(getStatus());
        return sb.toString();
    }
}
