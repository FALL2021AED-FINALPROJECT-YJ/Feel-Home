
package model;

import java.util.ArrayList;
import java.util.List;

public class TherapistDirectory {
   List<Therapist> listOfTheraphist;
   
   public  TherapistDirectory(){
       listOfTheraphist = new ArrayList<>();
   }

    public List<Therapist> getListOfTheraphist() {
        return listOfTheraphist;
    }

    public void setListOfTheraphist(List<Therapist> listOfTheraphist) {
        this.listOfTheraphist = listOfTheraphist;
    }
   
}
