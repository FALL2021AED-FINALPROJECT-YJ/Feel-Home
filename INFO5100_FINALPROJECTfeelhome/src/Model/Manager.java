package model;

public class Manager {

    private String id;
    private String password;
    private String contact;
    private String userName;
    
    public Manager(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Manager(String id, String password,String contact) {
        this.id = id;
        this.password = password;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Manager(String id) {
        this.id = id;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getManagerId() {
        return id;
    }

    public void setManagerId(String id) {
        this.id = id;
    }

}
