package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transportation {
    private String name;
    private Date pickup;
    private Date drop;
    private boolean status;
    List<Manager> listOfManager;

    public Transportation() {
        listOfManager = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Date getPickup() {
        return pickup;
    }

    public void setPickup(Date pickup) {
        this.pickup = pickup;
    }

    public Date getDrop() {
        return drop;
    }

    public void setDrop(Date drop) {
        this.drop = drop;
    }

    public Manager addManager(String id) {
        Manager manager = new Manager(id);
        listOfManager.add(manager);
        return manager;
    }

}
