package model;

import java.util.List;

public class MenuItem {

    private String details;
    
    public MenuItem(String item){
        this.details = item;
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
