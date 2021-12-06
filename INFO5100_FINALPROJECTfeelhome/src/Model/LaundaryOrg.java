package model;

import java.util.ArrayList;
import java.util.List;

public class LaundaryOrg {

    private String name;
    private String city;
    private String contact;
    private List<Manager> listOfManager;
    private List<LaundaryService> listOfLaundaryMan;

    public LaundaryOrg(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        listOfManager = new ArrayList<>();
        listOfLaundaryMan = new ArrayList<>();
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

    public List<LaundaryService> getListOfLaundaryMan() {
        return listOfLaundaryMan;
    }

    public void setListOfLaundaryMan(List<LaundaryService> listOfLaundaryMan) {
        this.listOfLaundaryMan = listOfLaundaryMan;
    }

    public void addLaundaryman(String name, String city, String user, String password1) {
        LaundaryService laundaryStaff = new LaundaryService(name, city, user, password1);
        listOfLaundaryMan.add(laundaryStaff);
        System.out.println("Deliveryman manager added is " + listOfLaundaryMan.size());
    }
    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }
}
