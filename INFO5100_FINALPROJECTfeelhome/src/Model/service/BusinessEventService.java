package model.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import model.BusinessEvent;

public class BusinessEventService extends Service {

    private BusinessEvent business;

    public static enum BusinessEventServiceType {
        PHOTOGRAPHY,
        DECOR,
        CATERING
    }

    private Map<BusinessEventServiceType, Integer> businessEventServiceCost;

    public BusinessEventService(BusinessEvent business, Date eventDate) {
        super(ServiceType.BUSINESS_EVENT, eventDate);
        this.businessEventServiceCost = new HashMap<>();
        this.business = business;
    }

    public Map<BusinessEventServiceType, Integer> getBusinessEventServiceCost() {
        return businessEventServiceCost;
    }

    public void setBusinessEventServiceCost(Map<BusinessEventServiceType, Integer> businessEventServiceCost) {
        this.businessEventServiceCost = businessEventServiceCost;
    }

    public BusinessEvent getBusiness() {
        return business;
    }

    public void setBusiness(BusinessEvent business) {
        this.business = business;
    }
    
    public void addService(BusinessEventServiceType type, int cost) {
        businessEventServiceCost.put(type, cost);
        totalCost += cost;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nBusiness Event service details:");
        sb.append("\n").append(TAB).append("Organization conducting event: ").append(business);
        sb.append("\n").append(TAB).append("Date of event: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        sb.append("\n").append(TAB).append("Below are the details of services included for the business event:");
        for (Map.Entry<BusinessEventServiceType, Integer> entry : businessEventServiceCost.entrySet()) {
            sb.append("\n").append(TAB).append(TAB)
                    .append(String.format("Service type: %s, Cost: %d", entry.getKey(), entry.getValue()));
        }
        sb.append("\n").append(TAB).append("Total cost: ").append(totalCost);
        return sb.toString();
    }
}
