
package model;

public class Room {
    private int capacity = 2;
    private  int price = 2 ;
    private String roomNo;
    private static int count;
    private static String available = "Available";
    private String status;
    
    public Room() {
        this.status = available;
        this.roomNo = "RoomNo" + String.valueOf(count+1);
        count++;
    }
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomId) {
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

}
