package model;

import java.util.ArrayList;
import java.util.List;

public class HealthClub {

    private String name;
    private String id;
    private String contact;
    List<Manager> listOfManager;
    private PhysicianDirectory pd;
    private TrainerDirectory td;
    private TherapistDirectory tpd;
   
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

    public PhysicianDirectory getPd() {
        return pd;
    }

    public void setPd(PhysicianDirectory pd) {
        this.pd = pd;
    }

    public TrainerDirectory getTd() {
        return td;
    }

    public void setTd(TrainerDirectory td) {
        this.td = td;
    }

    public TherapistDirectory getTpd() {
        return tpd;
    }

    public void setTpd(TherapistDirectory tpd) {
        this.tpd = tpd;
    }
    

    public Manager addManager(String id) {
        Manager manager = new Manager(id);
        listOfManager.add(manager);
        return manager;
    }

}
