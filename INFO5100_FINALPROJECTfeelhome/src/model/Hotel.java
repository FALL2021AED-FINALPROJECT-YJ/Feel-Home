package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Enterprise {

    String name;
    String contact;
    String username;
    String password;
    private List<Room> listOfRoom;
    private List<Manager> listOfManager;
    private List<LaundaryService> laundaryList;
    private List<Transportation> transportationList;
    private Services serviceDirec;

    public Hotel(String name, String contact, String username, String password) {
        super(name, contact, username, password);
        listOfManager = new ArrayList<>();
        serviceDirec = new Services();
        listOfRoom = new ArrayList<>();
        listOfRoom.add(new Room());
        listOfRoom.add(new Room());
        listOfRoom.add(new Room());
        transportationList = new ArrayList<>();
        laundaryList = new ArrayList<>();
    }

    public List<LaundaryService> getLaundaryList() {
        return laundaryList;
    }

    public void setLaundaryList(List<LaundaryService> laundaryList) {
        this.laundaryList = laundaryList;
    }

    public List<Transportation> getTransportationList() {
        return transportationList;
    }

    public void setTransportationList(List<Transportation> transportationList) {
        this.transportationList = transportationList;
    }
    

    public List<Room> getListOfRoom() {
        return listOfRoom;
    }

    public void setListOfRoom(List<Room> listOfRoom) {
        this.listOfRoom = listOfRoom;
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
