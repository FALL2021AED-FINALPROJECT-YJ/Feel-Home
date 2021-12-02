package model;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private String name;
    private String contact;
    
   public Enterprise(String name,String contact){
       this.name = name;
       this.contact = contact;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
