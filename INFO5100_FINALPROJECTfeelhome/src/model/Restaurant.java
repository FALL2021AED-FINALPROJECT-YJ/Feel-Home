package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Enterprise{
    private String name;
    private String contact;
    private String username;
    private String password;
    private List<Manager> listOfManager;
    private List<Order> listOfOrder;
    private DeliveryManDirectory deliverymanDirec;

    public Restaurant(String name,String contact,String username,String password) {
        super(name,contact,username,password);
//        this.username = username;
//        this.password = password;
        listOfManager = new ArrayList<>();
        listOfOrder = new ArrayList<>();
        deliverymanDirec = new DeliveryManDirectory();
    }
    
}
