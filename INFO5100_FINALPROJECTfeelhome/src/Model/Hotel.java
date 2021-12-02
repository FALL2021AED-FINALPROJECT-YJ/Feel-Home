
package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Enterprise {

    private List<Manager> listOfManager;
    private Services serviceDirec;
    
    public Hotel(){
       listOfManager = new ArrayList<>();
       serviceDirec = new Services();
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
