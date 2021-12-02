package model;

import java.util.ArrayList;
import java.util.List;

public class HealthClub extends Enterprise{
    private String username;
    private String password;
    List<Manager> listOfManager;
    private PhysicianDirectory pd;
    private TrainerDirectory td;
    private TherapistDirectory tpd;

    HealthClub(String name, String contact, String userName, String password) {
        super(name, contact);
//this.name = name;
//this.contact =contact;
        this.username = userName;
        this.password = password;
        listOfManager = new ArrayList<>();
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
