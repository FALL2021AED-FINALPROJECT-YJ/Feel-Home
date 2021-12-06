package model.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BusinessEventService extends Service {

    public static enum BusinessEventServiceType {
        PHOTOGRAPHY,
        DECOR,
        CATERING
    }

    private Map<BusinessEventServiceType, Integer> businessEventServiceCost;

    public BusinessEventService(Date eventDate) {
        super(ServiceType.BUSINESS_EVENT, eventDate);
        this.businessEventServiceCost = new HashMap<>();
    }

    public Map<BusinessEventServiceType, Integer> getBusinessEventServiceCost() {
        return businessEventServiceCost;
    }

    public void setBusinessEventServiceCost(Map<BusinessEventServiceType, Integer> businessEventServiceCost) {
        this.businessEventServiceCost = businessEventServiceCost;
    }

    public void addService(BusinessEventServiceType type, int cost) {
        businessEventServiceCost.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nBusiness Event service details - ");
        sb.append("\n\tTotal cost - ").append(totalCost);
        sb.append("\n\tDate of order - ").append(getDate());
        sb.append("\n\tStatus - ").append(getStatus());
        sb.append("\n\tBelow are the details of services included in the business event -");
        for (Map.Entry<BusinessEventServiceType, Integer> entry : businessEventServiceCost.entrySet()) {
                sb.append(String.format("\n\t\tBusineessEventType - %s, Cost %d", entry.getKey(), entry.getValue()));
        }
        return sb.toString();        
    }
}
