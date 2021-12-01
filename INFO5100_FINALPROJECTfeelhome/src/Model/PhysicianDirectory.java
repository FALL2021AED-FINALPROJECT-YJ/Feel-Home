package model;

import java.util.ArrayList;
import java.util.List;

public class PhysicianDirectory {
    List<Physician> listOfPhysician;
    
    public  PhysicianDirectory(){
        listOfPhysician = new ArrayList<>();
    }

    public List<Physician> getListOfPhysician() {
        return listOfPhysician;
    }

    public void setListOfPhysician(List<Physician> listOfPhysician) {
        this.listOfPhysician = listOfPhysician;
    }
    
}
