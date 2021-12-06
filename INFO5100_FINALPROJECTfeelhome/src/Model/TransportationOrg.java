package model;

import java.util.ArrayList;
import java.util.List;

public class TransportationOrg {

    private String name;
    private String city;
    private String contact;
    private List<Manager> listOfManager;
    private List<Transportation> listOfTransportation;

    public TransportationOrg(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        listOfManager = new ArrayList<>();
       listOfTransportation= new ArrayList<>();
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

    public List<Transportation> getListOfTransportation() {
        return listOfTransportation;
    }

    public void setListOfTransportation(List<Transportation> listOfTransportation) {
        this.listOfTransportation = listOfTransportation;
    }

  
    public void addTransportationman(String name, String city, String user, String password1) {
        Transportation  transportation= new Transportation(name, city, user, password1);
        listOfTransportation.add(transportation);
        System.out.println("Deliveryman manager added is " + listOfTransportation.size());
    }
    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }
  
}
