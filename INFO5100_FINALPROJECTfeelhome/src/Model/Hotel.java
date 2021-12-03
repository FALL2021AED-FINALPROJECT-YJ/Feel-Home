package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel extends Enterprise {
    private List<Room> listOfRoom;
    private List<Manager> listOfManager;
    private List<LaundaryService> laundaryList;
    private List<Transportation> transportationList;
    private Services serviceDirec;

    public Hotel(String name, String contact) {
        super(name, contact);
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
    
    public String toString() {
        return "Hotel:" + name + ", Rooms:" + listOfRoom;
    }

}
