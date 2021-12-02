package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EnterpriseDirectory {
   Map<String,List<Enterprise>> map;

//    private HotelDirectory hotelDirec;
    private List<BusinessEvent> listOfEvents;
    private List<HealthClub> listOfHealthClub;
    private List<Restaurant> listOfRestaurants;

    public EnterpriseDirectory() {
//         hotelDirec = new HotelDirectory();
         listOfEvents = new ArrayList<>();
         listOfHealthClub = new ArrayList<>();
         listOfRestaurants = new ArrayList<>();
    }
    
    public Map<String, List<Enterprise>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<Enterprise>> map) {
        this.map = map;
    }

    public List<BusinessEvent> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<BusinessEvent> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<HealthClub> getListOfHealthClub() {
        return listOfHealthClub;
    }

    public void setListOfHealthClub(List<HealthClub> listOfHealthClub) {
        this.listOfHealthClub = listOfHealthClub;
    }

    public List<Restaurant> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void setListOfRestaurants(List<Restaurant> listOfRestaurants) {
        this.listOfRestaurants = listOfRestaurants;
    }

    public void addHealthClub(String name, String contact, String userName, String password) {
        HealthClub healthClub = new HealthClub(name, contact, userName, password);
        listOfHealthClub.add(healthClub);
    }

    public void addRestaurant(String name, String contact, String username, String password) {
        Restaurant restaurant = new Restaurant(name, contact, username, password);
        listOfRestaurants.add(restaurant);
    }

    public void addBusinessEvent(String name, String contact, String userName, String password) {
        BusinessEvent event = new BusinessEvent(name, contact, userName, password);
        listOfEvents.add(event);
    }

    public void addHotel(String name, String contact, String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
