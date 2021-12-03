package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessEvent extends Enterprise {

    private List<Manager> listOfManager;
    private OraganisationdirectoryForEvents orgDirecForEvents;

    public BusinessEvent(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public OraganisationdirectoryForEvents getOrgDirecForEvents() {
        return orgDirecForEvents;
    }

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

}
