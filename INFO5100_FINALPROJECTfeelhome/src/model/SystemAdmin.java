
package model;

import java.util.ArrayList;
import java.util.List;

public class SystemAdmin {
    private List<Network> listOfNetwork;
    private CustomerDirectory customerDirec;
    
    public SystemAdmin() {
        listOfNetwork = new ArrayList<>();
        listOfNetwork.add(new Network("Seattle"));
        listOfNetwork.add(new Network("Boston"));
        customerDirec = new CustomerDirectory();
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
    
    public void addNetwork(String name){
        Network network = new Network(name);
        listOfNetwork.add(network);
    }
    
    public Network findNetwork(String networkName){
        for(Network network :listOfNetwork ){
        if(listOfNetwork!=null && network.getName().equals(networkName)){
            return network;
        }
    }
        return null;
    }
    
}
