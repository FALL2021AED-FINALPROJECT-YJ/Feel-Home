package model;

import java.util.ArrayList;
import java.util.List;

public class OraganisationdirectoryForEvents {

    List<CateringServices> listOfCatering;
    List<PhotographyServices> listOfPhotographyServices;
    List<DecorServices> listOfDecors;

    public OraganisationdirectoryForEvents() {
        listOfCatering = new ArrayList<>();
        listOfPhotographyServices = new ArrayList<>();
        listOfDecors = new ArrayList<>();
    }

    public List<CateringServices> getListOfCatering() {
        return listOfCatering;
    }

    public void setListOfCatering(List<CateringServices> listOfCatering) {
        this.listOfCatering = listOfCatering;
    }

    public List<PhotographyServices> getListOfPhotographyServices() {
        return listOfPhotographyServices;
    }

    public void setListOfPhotographyServices(List<PhotographyServices> listOfPhotographyServices) {
        this.listOfPhotographyServices = listOfPhotographyServices;
    }

    public List<DecorServices> getListOfDecors() {
        return listOfDecors;
    }

    public void setListOfDecors(List<DecorServices> listOfDecors) {
        this.listOfDecors = listOfDecors;
    }

    public DecorServices addDecorService() {
        DecorServices ds = new DecorServices();
        listOfDecors.add(ds);
        return ds;
    }

    public void addCateringService() {
        CateringServices cs = new CateringServices();
        listOfCatering.add(cs);
    }

    public PhotographyServices addPhotographyService() {
        PhotographyServices ps = new PhotographyServices();
        listOfPhotographyServices.add(ps);
        return ps;
    }

}
