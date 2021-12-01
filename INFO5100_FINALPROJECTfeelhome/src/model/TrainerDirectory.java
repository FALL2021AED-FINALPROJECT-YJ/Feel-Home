
package model;

import java.util.ArrayList;
import java.util.List;

public class TrainerDirectory {
    List<Trainer> listOfTrainer;
     
    public TrainerDirectory(){
        listOfTrainer = new ArrayList<>();
    }

    public List<Trainer> getListOfTrainer() {
        return listOfTrainer;
    }

    public void setListOfTrainer(List<Trainer> listOfTrainer) {
        this.listOfTrainer = listOfTrainer;
    }
    
}
