
package model;

import java.util.ArrayList;
import java.util.List;


public class DeliveryManDirectory {

    private List<DeliveryMan> list;

    public DeliveryManDirectory() {
        list = new ArrayList<>();
    }

    public List<DeliveryMan> getList() {
        return list;
    }

    public void setList(List<DeliveryMan> list) {
        this.list = list;
    }

}
