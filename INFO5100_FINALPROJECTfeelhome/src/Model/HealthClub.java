package model;

import java.util.ArrayList;
import java.util.List;

public class HealthClub {

    private String name;
    private String id;
    private String contact;
    List<Manager> listOfManager;

    public HealthClub() {
        listOfManager = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Manager addManager(String id) {
        Manager manager = new Manager(id);
        listOfManager.add(manager);
        return manager;
    }

}
