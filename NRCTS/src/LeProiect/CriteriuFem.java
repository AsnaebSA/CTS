package LeProiect;

import java.util.ArrayList;
import java.util.List;

public class CriteriuFem {
	   public List<Datepers> meetCriteria(List<Datepers> persons) {
		      List<Datepers> persoaneFeminine = new ArrayList<Datepers>(); 
		      
		      for (Datepers person : persons) {
		         if(person.getGen().equalsIgnoreCase("Feminin")){
		            persoaneFeminine.add(person);
		         }
		      }
		      
		      return persoaneFeminine;
		   }
		}

