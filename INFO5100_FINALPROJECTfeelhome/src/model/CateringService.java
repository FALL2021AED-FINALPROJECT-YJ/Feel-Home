
package model;

import java.util.ArrayList;
import java.util.List;

public class CateringService {
    private String nameOfOrg;  //name of organisation
    private String contact;
    private String id;
    private List<Manager> listOfManager;
    private PackageDirectoryForCatering pd;

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public PackageDirectoryForCatering getPd() {
        return pd;
    }

    public void setPd(PackageDirectoryForCatering pd) {
        this.pd = pd;
    }
    
    public CateringService(){
        listOfManager = new ArrayList<>();
    }
   
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNameOfOrg() {
        return nameOfOrg;
    }

    public void setNameOfOrg(String nameOfOrg) {
        this.nameOfOrg = nameOfOrg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Manager addManager(){
        Manager manager = new Manager();
        listOfManager.add(manager);
        return manager;
    }
      
}
