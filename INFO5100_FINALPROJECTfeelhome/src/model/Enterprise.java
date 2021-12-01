package model;

import java.util.List;

public class Enterprise {

    private HotelDirectory hotelDirec;
    private List<BusinessEvent> listOfEvents;
    private List<HealthClub> listOfHealthClub;
    private List<Restaurant> listOfRestaurants;

    public Enterprise() {
        hotelDirec = new HotelDirectory();
    }

    public HotelDirectory getHotelDirec() {
        return hotelDirec;
    }

    public void setHotelDirec(HotelDirectory hotelDirec) {
        this.hotelDirec = hotelDirec;
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
    

}
