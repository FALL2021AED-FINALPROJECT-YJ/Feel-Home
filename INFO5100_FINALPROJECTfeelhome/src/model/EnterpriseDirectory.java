
package model;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseDirectory {
 List<Enterprise> listOfEnterprise;
 
 public EnterpriseDirectory() {
     listOfEnterprise = new ArrayList<>();
 }

    public List<Enterprise> getListOfEnterprise() {
        return listOfEnterprise;
    }

    public void setListOfEnterprise(List<Enterprise> listOfEnterprise) {
        this.listOfEnterprise = listOfEnterprise;
    }
 
}
