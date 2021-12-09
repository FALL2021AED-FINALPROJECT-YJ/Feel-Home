package model.service;

import java.util.Date;
import model.Organization;

public abstract class Service {
    
    protected static final String TAB = "      ";
    
    static enum ServiceType {
        BUSINESS_EVENT,
        RESTURANT,
        HEALTH_CLUB
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    private Organization organization;
    private Status status;
    protected int totalCost;

    Service(ServiceType serviceType, Date date) {
        this.serviceType = serviceType;
        this.date = date;
        this.status = Status.PENDING;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract String toString();
}
