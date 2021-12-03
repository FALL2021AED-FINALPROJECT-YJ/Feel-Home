package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemAdmin {

    private List<Network> listOfNetwork;
    private CustomerDirectory customerDirec;
    private Map<String, String> map;

    public SystemAdmin() {
        listOfNetwork = new ArrayList<>();
        listOfNetwork.add(new Network("Seattle"));
        listOfNetwork.add(new Network("Boston"));
        customerDirec = new CustomerDirectory();
        map = new HashMap<>();
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Network> getListOfNetwork() {
        return listOfNetwork;
    }

    public void setListOfNetwork(List<Network> listOfNetwork) {
        this.listOfNetwork = listOfNetwork;
    }

    public CustomerDirectory getCustomerDirec() {
        return customerDirec;
    }

    public void setCustomerDirec(CustomerDirectory customerDirec) {
        this.customerDirec = customerDirec;
    }

    public void addNetwork(String name) {
        Network network = new Network(name);
        listOfNetwork.add(network);
    }

    public Network findNetwork(String networkName) {
        for (Network network : listOfNetwork) {
            if (listOfNetwork != null && network.getName().equals(networkName)) {
                return network;
            }
        }
        return null;
    }

    public void addUser(String username, String type) {
        map.put(username, type);
    }

    public String findUser(String username) {
        if (map.containsKey(username)) {
            return map.get(username);
        }
        return null;
    }

}
