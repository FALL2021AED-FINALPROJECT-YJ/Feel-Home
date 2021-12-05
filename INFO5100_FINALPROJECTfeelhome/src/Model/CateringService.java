package model;

import java.util.ArrayList;
import java.util.List;

public class CateringService {

    private String name;
    private String city;
    private String contact;
    private List<Manager> listOfManager;
    private PackageDirectoryForCatering packageForCatering;

    public CateringService(String name, String contact, String city) {
        this.name = name;
        this.contact = contact;
        this.city = city;
        listOfManager = new ArrayList<>();
        packageForCatering = new PackageDirectoryForCatering();
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

    public PackageDirectoryForCatering getPackageForCatering() {
        return packageForCatering;
    }

    public void setPackageForCatering(PackageDirectoryForCatering packageForCatering) {
        this.packageForCatering = packageForCatering;
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

    public Manager addManager(String name, String city, String user, String password1) {
        Manager manager = new Manager(name,city, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUserName());
        return manager;
    }
}
