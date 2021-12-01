package model;

import java.util.ArrayList;
import java.util.List;

public class Services {
    List<BusinessEvent> listOfEvents;
    List<HealthClub> listOfHealthClub;
    List<Restaurant> listOfRestaurants;

    public Services() {
        listOfEvents = new ArrayList<>();
        listOfHealthClub = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
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
