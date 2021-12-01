
package model;

public class Room {
    private int capacity = 2;
    private int price ;
    private int roomNo;
    private boolean booked = false;
    
    public Room(int roomId){
        this.roomNo = roomId;
    }
    
    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomId) {
        this.roomNo = roomId;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setBooked(boolean booked){
        this.booked = booked;
    }
    public boolean getBooked()
    {
        return booked;
    }
    
}
