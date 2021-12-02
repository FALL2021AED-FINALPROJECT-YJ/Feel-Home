
package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerDirectory {
    private List<Customer> listOfCustomer;
    
    public  CustomerDirectory () {
        listOfCustomer = new ArrayList<>();
    }

    public List<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(List<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }
    
}
