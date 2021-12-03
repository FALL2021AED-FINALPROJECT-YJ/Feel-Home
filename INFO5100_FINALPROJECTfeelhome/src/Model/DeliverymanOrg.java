package model;

import java.util.ArrayList;
import java.util.List;

public class DeliverymanOrg {

    String name;
    String city;
    String contact;
    List<Manager> listOfManager;
    List<DeliveryMan> listOfDeliveryMan;

    public DeliverymanOrg(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        listOfManager = new ArrayList<>();
        listOfDeliveryMan = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<DeliveryMan> getListOfDeliveryMan() {
        return listOfDeliveryMan;
    }

    public void setListOfDeliveryMan(List<DeliveryMan> listOfDeliveryMan) {
        this.listOfDeliveryMan = listOfDeliveryMan;
    }

    public void addDeliveryman(String name, String city, String user, String password1) {
        DeliveryMan del = new DeliveryMan(name, city, user, password1);
        listOfDeliveryMan.add(del);
        System.out.println("Physisicna manager added is " + listOfDeliveryMan.size());
    }
}
