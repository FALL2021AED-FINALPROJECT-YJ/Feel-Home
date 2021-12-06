package model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    private List<HealthClubServiceType> healthClubService;

    public HealthClubService(Date eventDate) {
        super(Service.ServiceType.HEALTH_CLUB, eventDate);
        this.healthClubService = new ArrayList<>();
    }

    public List<HealthClubServiceType> getHealthClubService() {
        return healthClubService;
    }

    public void setHealthClubService(List<HealthClubServiceType> healthClubService) {
        this.healthClubService = healthClubService;
    }

    public void addService(HealthClubServiceType type) {
        healthClubService.add(type);
        totalCost += type.price;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());

        if (!getStatus().equals(Service.Status.REJECTED)) {
            builder.append("\nBelow are the details of the services includede in the event - ");

            for (HealthClubServiceType type : healthClubService) {
                builder.append(String.format("\n     BusineessEventType - %s, Cost %d", type.name(), type.price));
            }
            builder.append("\n Total cost for the event will be ").append(totalCost);
        }
        return builder.toString();
    }
}
