
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDirectoryForCatering {

   private  List<Packages> listOfPackages;
    
    public PackageDirectoryForCatering() {
        listOfPackages = new ArrayList<>();
        listOfPackages.add(new Packages("gold",Arrays.asList("FriedRice","Gulabjamun")));
        listOfPackages.add(new Packages("platinum", Arrays.asList("FriedRice","Cheesballs","GulabJamun")));     
    }

    public List<Packages> getListOfPackages() {
        return listOfPackages;
    }

    public void setListOfPackages(List<Packages> listOfPackages) {
        this.listOfPackages = listOfPackages;
    }
}

