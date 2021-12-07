package model;

import java.util.ArrayList;
import java.util.List;

public class TrainerOrg {

    String name;
    String city;
    String contact;
    List<Manager> listOfManager;
    List<Trainer> listOfTrainer;

    public TrainerOrg(String name, String contact, String city) {
        this.name = name;
        this.city = city;
        this.contact = contact;
        listOfManager = new ArrayList<>();
        listOfTrainer = new ArrayList<>();
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

    public void addTrainer(String name, String city, String user, String password1) {
        Trainer trainer = new Trainer(name, city, user, password1);
        listOfTrainer.add(trainer);
    }
    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUsername());
        return manager;
    }
}
