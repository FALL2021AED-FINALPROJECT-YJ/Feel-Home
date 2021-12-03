
package model;

import java.util.ArrayList;
import java.util.List;

public class LaundaryService {
    private String name;
    private int id;
    List<Manager> listOfManager;
    private boolean status;
    
   public LaundaryService(){
       listOfManager = new ArrayList<>();
   }
    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public Manager addManager(String name,String username,String password){
        Manager manager = new Manager(name,username,password);
        listOfManager.add(manager);
        return manager;
    }
    
}
