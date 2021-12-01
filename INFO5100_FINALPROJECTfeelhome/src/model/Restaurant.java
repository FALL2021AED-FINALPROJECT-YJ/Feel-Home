package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String resName;
    private String contact;
    private List<Manager> listOfManager;
    private List<Order> listOfOrder;
    private DeliveryManDirectory deliverymanDirec;

    public Restaurant() {
        listOfManager = new ArrayList<>();
        listOfOrder = new ArrayList<>();
        deliverymanDirec = new DeliveryManDirectory();
    }
    
}
