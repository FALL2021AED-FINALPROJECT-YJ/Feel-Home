package model;

import java.util.ArrayList;
import java.util.List;

public class PhotographyService {

    private String name;
    private String city;
    private String contact;
    private List<Manager> listOfManager;

    public PhotographyService(String name, String contact, String city) {
        this.name = name;
        this.contact = contact;
        this.city = city;
        listOfManager = new ArrayList<>();
    }

      public enum PhotographyType {
        STANDARD(50, "Standard"),
        GOLD(100, "Gold"),
        PREMIUM(200, "Premium");

        private final int rate;
        private final String name;

        private PhotographyType(int rate, String name) {
            this.rate = rate;
            this.name = name;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + rate + "$ per night)";
        }
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
        Manager manager = new Manager(name, city, user, password1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getUserName());
        return manager;
    }
}
