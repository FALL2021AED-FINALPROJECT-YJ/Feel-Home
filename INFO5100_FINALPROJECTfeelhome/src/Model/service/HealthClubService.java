package model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.HealthClub;

public class HealthClubService extends Service {

    public static enum HealthClubServiceType {
        PHYSICIAN(60),
        TRAINER(20),
        THERAPIST(20);

        private final int price;

        private HealthClubServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private HealthClub healthClub;
    private List<HealthClubServiceType> healthClubServices;

    public HealthClubService(HealthClub healthClub, Date date) {
        super(Service.ServiceType.HEALTH_CLUB, date);
        this.healthClubServices = new ArrayList<>();
        this.healthClub = healthClub;
    }

    public HealthClub getHealthClub() {
        return healthClub;
    }

    public void setHealthClub(HealthClub healthClub) {
        this.healthClub = healthClub;
    }

    public List<HealthClubServiceType> getHealthClubServices() {
        return healthClubServices;
    }

    public void setHealthClubServices(List<HealthClubServiceType> healthClubServices) {
        this.healthClubServices = healthClubServices;
    }

    public void addService(HealthClubServiceType type) {
        healthClubServices.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nHealth club service details:");
        sb.append("\n").append(TAB).append("Health club: ").append(healthClub);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        sb.append("\n").append(TAB).append("Below are the details of services included for your appointment:");
        for (HealthClubServiceType service : healthClubServices) {
            sb.append("\n").append(TAB).append(TAB)
                    .append(String.format("Service type: %s, Cost: %d", service.toString(), service.getPrice()));
        }
        sb.append("\n").append(TAB).append("Total cost: ").append(totalCost);
        return sb.toString();
    }
}
