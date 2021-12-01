
package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private String id;
    private String contact;
    private List<Manager> listOfManager;
    private Services serviceDirec;
    
    public Hotel(){
       listOfManager = new ArrayList<>();
       serviceDirec = new Services();
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

    public Services getServiceDirec() {
        return serviceDirec;
    }

    public void setServiceDirec(Services serviceDirec) {
        this.serviceDirec = serviceDirec;
    }
    
    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }
    
}
