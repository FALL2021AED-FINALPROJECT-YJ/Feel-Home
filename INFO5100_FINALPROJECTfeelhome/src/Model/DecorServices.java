package model;

import java.util.ArrayList;
import java.util.List;

public class DecorServices {
    private String orgName;
    private String id;
    private String contact;
    private String booked;
    private List<Manager> listOfManager;
    private PackageDirectoryForDecor packageForDecor;
    
    public DecorServices(){
        listOfManager = new ArrayList<>();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public String getBooked() {
        return booked;
    }

    public void setBooked(String booked) {
        this.booked = booked;
    }

    public PackageDirectoryForDecor getPackageForDecor() {
        return packageForDecor;
    }

    public void setPackageForDecor(PackageDirectoryForDecor packageForDecor) {
        this.packageForDecor = packageForDecor;
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
    public Manager addManager(String id){
        Manager manager = new Manager(id);
        listOfManager.add(manager);
        return manager;    
    }
}
