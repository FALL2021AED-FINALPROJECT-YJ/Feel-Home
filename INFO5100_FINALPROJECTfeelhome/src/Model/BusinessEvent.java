package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessEvent extends Enterprise {

    private Date date;
    private List<Manager> listOfManager;
    private List<CateringService> listOfCatering;
    private List<PhotographyOrg> listOfPhotographyServices;
    private List<DecorOrg> listOfDecors;

    public BusinessEvent(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfCatering = new ArrayList<>();
        listOfPhotographyServices = new ArrayList<>();
        listOfDecors = new ArrayList<>();

    }
  
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<CateringService> getListOfCatering() {
        return listOfCatering;
    }

    public void setListOfCatering(List<CateringService> listOfCatering) {
        this.listOfCatering = listOfCatering;
    }

    public List<PhotographyOrg> getListOfPhotographyServices() {
        return listOfPhotographyServices;
    }

    public void setListOfPhotographyServices(List<PhotographyOrg> listOfPhotographyServices) {
        this.listOfPhotographyServices = listOfPhotographyServices;
    }

    public List<DecorOrg> getListOfDecors() {
        return listOfDecors;
    }

    public void setListOfDecors(List<DecorOrg> listOfDecors) {
        this.listOfDecors = listOfDecors;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUsername().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addCateringService(String name, String contact, String city) {
        CateringService cat = new CateringService(name, contact, city);
        System.out.println(name);
        listOfCatering.add(cat);
        System.out.println("catering size is " + listOfCatering.size() + " name is " + listOfCatering.get(0).getName());

    }

    public void addPhotographyService(String name, String contact, String city) {
        PhotographyOrg photo = new PhotographyOrg(name, contact, city);
        listOfPhotographyServices.add(photo);

    }

    public void addDecorService(String name, String contact, String city) {
        DecorOrg decor = new DecorOrg(name, contact, city);
        listOfDecors.add(decor);
    }
    
    public String toString() {
        return name;
    }

}
