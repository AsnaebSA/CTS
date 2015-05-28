package LeProiect;
import java.io.File;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			
			
			/*--------FACTORY----------
			PersFact PF = new PersFact();
			Datepers cumparator = PF.getDatepers("Cumparator");
			cumparator.afisareDatepers();
			Datepers angajat = PF.getDatepers("Angajat");
			angajat.afisareDatepers();
						
			---------SINGLETON---------------
			singleton singleton = singleton.getSingleton();
			singleton.showMessage();
			
			
			----------Filter------------
public class Criteriu {
   public static void main(String[] args) {
      List<Datepers> persons = new ArrayList<Datepers>();

      persons.add(new Person("Robert","Male", "Single"));
      persons.add(new Person("John", "Male", "Married"));
      persons.add(new Person("Laura", "Female", "Married"));
      persons.add(new Person("Diana", "Female", "Single"));
      persons.add(new Person("Mike", "Male", "Single"));
      persons.add(new Person("Bobby", "Male", "Single"));

      Criteria male = new CriteriaMasc();
      Criteria female = new CriteriaFem();
      Criteria single = new CriteriaSingle();

      System.out.println("Persoane de genul masculin: ");
      printPersons(masculin.meetCriteria(persons));

   public static void printPers(List<Datepers> persons){
   
      for (Person person : persons) {
         System.out.println("Person : [ Nume : " + person.getNume() + ", Prenume: " + person.getPrenume", Gen : " + person.getGen()", Varsta : " +person.getVarsta()");
      }
   }      
}
			*/
			
			  //////////CITIRE FISIER////////
			//ArrayList<Utilizator> listaClienti = new ArrayList<Utilizator>();
			PersObj p = new PersObj();
			File f = new File("persoane.txt");
			try {
				Scanner scanner;
				scanner = new Scanner(f);
				while(scanner.hasNext()){
					String line = scanner.nextLine();
					String[] array = line.split(" ");
					PersFact factory= new PersFact();
	p = factory.getDatepers("Cumparator");
	p.creareDatepers(array[0], array[1], array[2], Float.parseFloat(array[3]));
	p.afisareDatepers();
				}
				scanner.close();
				
				}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	}


