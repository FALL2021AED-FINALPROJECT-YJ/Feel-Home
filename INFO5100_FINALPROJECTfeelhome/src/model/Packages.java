package model;

import java.util.ArrayList;
import java.util.List;

public class Packages {        //goldpackage or platinum pacakage

    List<MenuItem> menuItemList;
    String name;

    public Packages(String platinum, List<String> itemList) {
        this.name = name;
        this.menuItemList = new ArrayList<>();
        for (String items : itemList) {
            menuItemList.add(new MenuItem(items));
        }
    }

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
