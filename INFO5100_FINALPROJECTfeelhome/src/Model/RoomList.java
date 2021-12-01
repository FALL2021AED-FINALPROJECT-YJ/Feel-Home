
package model;
import java.util.ArrayList;
import java.util.List;

public class RoomList {
    List<Room> listOfRooms;
    
    public RoomList(){
      listOfRooms = new ArrayList<>(); 
      listOfRooms.add(new Room(1));
      listOfRooms.add(new Room(2));
      listOfRooms.add(new Room(3));   
    }
    
    public List<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }
    public void createRoom(){
        Room room = new Room(listOfRooms.size()+1);
        listOfRooms.add(room);
    }
    
    public int getRoomPrice(int noOfRooms){
        int price = noOfRooms * 2;  //price per room is $2
        return price;
    }
     
}
