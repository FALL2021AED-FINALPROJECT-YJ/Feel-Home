
package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessEvent {
     private String username;
    private String password;
    private List<Manager> listOfManager;
    private OraganisationdirectoryForEvents orgDirecForEvents;

    public BusinessEvent(String name, String contact, String username, String password) {
        super(name, contact);
        this.username = username;
        this.password = password;
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
