package model;

import java.util.ArrayList;
import java.util.List;

public class PhotographyService {

    private List<Manager> listOfManager;
    private String orgName;
    private String contact;
    private List<Photographer> listOfPhotgrapher;
    private PackgeDirectoryForPhotography photography;

    public PhotographyService() {
        listOfPhotgrapher = new ArrayList<>();
        listOfManager = new ArrayList<>();
    }

    public List<Photographer> getListOfPhotgrapher() {
        return listOfPhotgrapher;
    }

    public void setListOfPhotgrapher(List<Photographer> listOfPhotgrapher) {
        this.listOfPhotgrapher = listOfPhotgrapher;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public PackgeDirectoryForPhotography getPhotography() {
        return photography;
    }

    public void setPhotography(PackgeDirectoryForPhotography photography) {
        this.photography = photography;
    }

    public Photographer addPhotographer(String id) {
        Photographer photographer = new Photographer(id);
        listOfPhotgrapher.add(photographer);
        return photographer;
    }

    public Manager addManager(String id) {
        Manager manager = new Manager(id);
        listOfManager.add(manager);
        return manager;
    }

}
