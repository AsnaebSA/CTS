package LeProiect;
import java.util.ArrayList;
import java.util.List;
public class CriteriuMasc {

   public List<Datepers> meetCriteria(List<Datepers> persons) {
      List<Datepers> persoaneMasculine = new ArrayList<Datepers>(); 
      
      for (Datepers person : persons) {
         if(person.getGen().equalsIgnoreCase("Masculin")){
            persoaneMasculine.add(person);
         }
      }
      
      return persoaneMasculine;
   }
}

