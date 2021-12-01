
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackgeDirectoryForPhotography {
    List<Packages> listOfPackages;
    
    public PackgeDirectoryForPhotography(){
        listOfPackages = new ArrayList<>();
        listOfPackages.add(new Packages("gold",Arrays.asList("videography","traditional photo")));
        listOfPackages.add(new Packages("platinum",Arrays.asList("album","videography","traditional photo")));    
    }
    public List<Packages> getListOfPackages() {
        return listOfPackages;
    }

    public void setListOfPackages(List<Packages> listOfPackages) {
        this.listOfPackages = listOfPackages;
    }
    
}
