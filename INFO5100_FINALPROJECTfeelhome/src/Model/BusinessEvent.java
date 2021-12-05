package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessEvent extends Enterprise {

    private List<Manager> listOfManager;
    private List<CateringService> listOfCatering;
    private List<PhotographyService> listOfPhotographyServices;
    private List<DecorService> listOfDecors;

    public BusinessEvent(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        listOfCatering = new ArrayList<>();
        listOfPhotographyServices = new ArrayList<>();
        listOfDecors = new ArrayList<>();

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

    public List<PhotographyService> getListOfPhotographyServices() {
        return listOfPhotographyServices;
    }

    public void setListOfPhotographyServices(List<PhotographyService> listOfPhotographyServices) {
        this.listOfPhotographyServices = listOfPhotographyServices;
    }

    public List<DecorService> getListOfDecors() {
        return listOfDecors;
    }

    public void setListOfDecors(List<DecorService> listOfDecors) {
        this.listOfDecors = listOfDecors;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUserName().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addCateringService(String name, String contact, String city) {
        CateringService cat = new CateringService(name, contact, city);
        System.out.println(name);
        listOfCatering.add(cat);
            System.out.println("catering size is " +listOfCatering.size()+ " name is " +listOfCatering.get(0).getName());

    }

    public void addPhotographyService(String name, String contact, String city) {
        PhotographyService photo = new PhotographyService(name, contact, city);
        listOfPhotographyServices.add(photo);

    }

    public void addDecorService(String name, String contact, String city) {
        DecorService decor = new DecorService(name, contact, city);
        listOfDecors.add(decor);
    }

}
