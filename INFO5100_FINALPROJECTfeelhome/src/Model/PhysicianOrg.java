package model;

import java.util.ArrayList;
import java.util.List;

public class PhysicianOrg {

    String name;
    String city;
    String contact;
    List<Manager> listOfManager;
    List<Physician> listOfPhysician;

    public PhysicianOrg(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        listOfManager = new ArrayList<>();
        listOfPhysician = new ArrayList<>();
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

    public List<Physician> getListOfPhysician() {
        return listOfPhysician;
    }

    public void setListOfPhysician(List<Physician> listOfPhysician) {
        this.listOfPhysician = listOfPhysician;
    }

    public void addPhysician(String name, String city, String user, String password1) {
        Physician physician = new Physician(name, city, user, password1);
        listOfPhysician.add(physician);
        System.out.println("Physisicna manager added is " + listOfPhysician.size());
    }

    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name,city, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUserName());
        return manager;
    }

}
