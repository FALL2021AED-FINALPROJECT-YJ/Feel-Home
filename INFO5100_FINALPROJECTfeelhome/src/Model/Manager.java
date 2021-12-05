package model;

public class Manager {

    private String name;
    private String password;
    private String contact;
    private String userName;
    private String city;

    public Manager(String name, String username, String password) {
        this.name = name;
        this.password = password;
        this.userName = username;
    }
     public Manager(String name, String city,String username, String password) {
        this.name = name;
        this.password = password;
        this.userName = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
     
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
