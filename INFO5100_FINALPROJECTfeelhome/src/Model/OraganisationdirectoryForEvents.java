package model;

import java.util.ArrayList;
import java.util.List;

public class OraganisationdirectoryForEvents {

    List<CateringService> listOfCatering;
    List<PhotographyService> listOfPhotographyServices;
    List<DecorService> listOfDecors;

    public OraganisationdirectoryForEvents() {
        listOfCatering = new ArrayList<>();
        listOfPhotographyServices = new ArrayList<>();
        listOfDecors = new ArrayList<>();
    }

    public List<CateringService> getListOfCatering() {
        return listOfCatering;
    }

    public void setListOfCatering(List<CateringService> listOfCatering) {
        this.listOfCatering = listOfCatering;
    }

    public List<PhotographyService> getListOfPhotographyServices() {
        return listOfPhotographyServices;
    }

    public void setListOfPhotographyServices(List<PhotographyService> listOfPhotographyServices) {
        this.listOfPhotographyServices = listOfPhotographyServices;
    }

    public List<DecorService> getListOfDecors() {
        return listOfDecors;
    }

    public void setListOfDecors(List<DecorService> listOfDecors) {
        this.listOfDecors = listOfDecors;
    }

    public DecorService addDecorService() {
        DecorService ds = new DecorService();
        listOfDecors.add(ds);
        return ds;
    }

    public void addCateringService() {
        CateringService cs = new CateringService();
        listOfCatering.add(cs);
    }

    public PhotographyService addPhotographyService() {
        PhotographyService ps = new PhotographyService();
        listOfPhotographyServices.add(ps);
        return ps;
    }

}
