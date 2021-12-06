package model;

import java.util.ArrayList;
import java.util.List;

public class DecorService {

    private String name;
    private String city;
    private String contact;
    private List<Manager> listOfManager;

    public DecorService(String name, String contact, String city) {
        this.name = name;
        this.contact = contact;
        this.city = city;
        listOfManager = new ArrayList<>();
    }

    public enum DecorType {
        STANDARD(50, "Standard", "Includes ballon decoration"),
        GOLD(100, "Gold", "Includes flower decoration and fire-works"),
        PLATINUM(200, "Premiume", "Includes flower decoration,fire-works and customised cake");

        private final int rate;
        private final String name;
        private final String description;

        private DecorType(int rate, String name, String description) {
            this.rate = rate;
            this.name = name;
            this.description = description;
        }

        public int getRate() {
            return rate;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
        

        public String toString() {
            return name + "(" + description + ")";
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
