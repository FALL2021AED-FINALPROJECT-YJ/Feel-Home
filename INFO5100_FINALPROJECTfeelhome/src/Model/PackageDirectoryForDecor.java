package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDirectoryForDecor {

    List<Packages> listOfDecor;

    public PackageDirectoryForDecor() {
        listOfDecor = new ArrayList<>();
        listOfDecor.add(new Packages("gold", Arrays.asList("baloon decoration", "customized cake")));
        listOfDecor.add(new Packages("platinum", Arrays.asList("customized cake", "baloon decoration", "flower decoration")));
    }
    
    public List<Packages> getListOfDecor() {
        return listOfDecor;
    }

    public void setListOfDecor(List<Packages> listOfDecor) {
        this.listOfDecor = listOfDecor;
    }
    
}
