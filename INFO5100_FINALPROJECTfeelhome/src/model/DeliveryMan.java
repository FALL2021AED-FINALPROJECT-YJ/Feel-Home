
package model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryMan {
    private String name;
    private String password;
    private String contact;
   
    List<Order> list = new ArrayList<>();

    public DeliveryMan(String name, String password,String contact) {
     this.name = name;
     this.password = password;
     this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public DeliveryMan(String name) {
        this.name = name;
    }

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void addOrder(Order order) {
        list.add(order);
    }

    public Order findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

}
