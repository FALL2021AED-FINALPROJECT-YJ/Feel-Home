package model;

import java.util.ArrayList;
import java.util.List;

public class PhysicianOrg extends Organization {

    List<Physician> listOfPhysician;

    public PhysicianOrg(String name, String contact, String city) {
        super(name, contact, city);
        listOfPhysician = new ArrayList<>();
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
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }

}
