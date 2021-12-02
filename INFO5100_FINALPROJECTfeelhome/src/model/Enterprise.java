package model;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private String name;
    private String contact;
    private String username;
    private String password;
    
   public Enterprise(String name,String contact,String username,String password){
       this.name = name;
       this.contact = contact;
       this.username = username;
       this.password = password;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
