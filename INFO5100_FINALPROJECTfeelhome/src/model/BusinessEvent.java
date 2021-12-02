package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessEvent extends Enterprise {
    private String name;
    private String contact;
    private String username;
    private String password;
    private List<Manager> listOfManager;
    private OraganisationdirectoryForEvents orgDirecForEvents;

    public BusinessEvent(String name, String contact, String username, String password) {
        super(name, contact,username,password);
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

}
