
package model;

import java.util.ArrayList;
import java.util.List;

public class BusinessEvent {
    private String name;
    private String id;
    private String contact;
    private List<Manager> listOfManager;
    private OrganizationDirectoryForEvents orgDirecForEvents;
    
    public BusinessEvent(){
      listOfManager = new ArrayList<>(); 
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public OrganizationDirectoryForEvents getOrgDirecForEvents() {
        return orgDirecForEvents;
    }

}
