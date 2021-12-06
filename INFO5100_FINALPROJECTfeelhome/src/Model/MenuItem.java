package model;

import java.util.List;

public class MenuItem {

    private String details;
    private String price;

    public MenuItem(String item, String price) {
        this.details = item;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String toString() {
        return details;
    }

}
