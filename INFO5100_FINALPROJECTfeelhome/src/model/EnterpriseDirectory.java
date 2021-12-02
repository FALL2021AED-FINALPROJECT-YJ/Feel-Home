package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EnterpriseDirectory {

    private List<Hotel> listOfHotel;
    private List<BusinessEvent> listOfEvents;
    private List<HealthClub> listOfHealthClub;
    private List<Restaurant> listOfRestaurants;

    public EnterpriseDirectory() {
        listOfHotel = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfHealthClub = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
    }

    public List<Hotel> getListOfHotel() {
        return listOfHotel;
    }

    public void setListOfHotel(List<Hotel> listOfHotel) {
        this.listOfHotel = listOfHotel;
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
        Hotel hotel = new Hotel(name, contact, userName, password);
        listOfHotel.add(hotel);
    }

    public Hotel findHotel(String hotelName) {
        for (Hotel hotel : listOfHotel) {
            if (hotel.getName().equals(hotelName)) {
                return hotel;
            }
        }
        return null;
    }

}
