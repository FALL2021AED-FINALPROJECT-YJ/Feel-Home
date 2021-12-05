package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel extends Enterprise {

    private List<Room> listOfRoom;
    private List<Manager> listOfManager;
    private List<LaundaryOrg> laundaryOrg;
    private List<TransportationOrg> transportationOrgList;
    private Services serviceDirec;

    public Hotel(String name, String contact) {
        super(name, contact);
        listOfManager = new ArrayList<>();
        serviceDirec = new Services();
        listOfRoom = new ArrayList<>();
        transportationOrgList = new ArrayList<>();
        laundaryOrg = new ArrayList<>();
    }

    public List<LaundaryOrg> getLaundaryOrg() {
        return laundaryOrg;
    }

    public void setLaundaryOrg(List<LaundaryOrg> laundaryList) {
        this.laundaryOrg = laundaryList;
    }

    public List<TransportationOrg> getTransportationOrgList() {
        return transportationOrgList;
    }

    public void setTransportationOrgList(List<TransportationOrg> transportationList) {
        this.transportationOrgList = transportationList;
    }

    public List<Room> getListOfRoom() {
        return listOfRoom;
    }

    public List<Room> availableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : listOfRoom) {
            if (room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> bookRooms(Date startDate, Date endDate, int count) {
        List<Room> availableRooms = availableRooms(startDate, endDate);
        if (availableRooms.size() < count) {
            throw new IllegalArgumentException("Rooms not available for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availableRooms.get(i).book(startDate, endDate);
        }

        // return booked room list
        return availableRooms.subList(0, count);
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

    public Manager addManager(String name, String username, String password) {
        Manager manager = new Manager(name, username, password);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String username) {
        for (Manager man : listOfManager) {
            if (man.getUserName().equals(username)) {
                return man;
            }
        }
        return null;
    }

    public void addLaundaryOrg(String name, String contact, String city) {
        LaundaryOrg laundaryOrg1 = new LaundaryOrg(name, contact, city);
        laundaryOrg.add(laundaryOrg1);
    }

    public void addTransportationOrg(String name, String contact, String networkName) {
        TransportationOrg to = new TransportationOrg(name, contact, networkName);
        transportationOrgList.add(to);
    }

    public String toString() {
        return "Hotel:" + name + ", Rooms:" + listOfRoom;
    }

}
