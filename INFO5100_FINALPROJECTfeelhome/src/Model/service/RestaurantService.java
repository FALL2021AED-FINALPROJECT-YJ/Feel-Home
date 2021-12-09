package model.service;

import java.util.Date;
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
        StringBuilder sb = new StringBuilder("\nRestaurant order details:");
        sb.append("\n").append(TAB).append("Restaurant name: ").append(res.getName());
        sb.append("\n").append(TAB).append("Order item: ").append(menuItem);
        sb.append("\n").append(TAB).append("Total cost: ").append(totalCost);
        sb.append("\n").append(TAB).append("Date of order: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        return sb.toString();
    }
}
