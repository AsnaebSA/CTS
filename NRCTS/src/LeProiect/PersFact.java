package LeProiect;

public class PersFact extends PersObj {

	public PersObj getDatepers(String tipPersoana) {

		if (tipPersoana == null) {
			return null;
		} else if (tipPersoana.equalsIgnoreCase("Cumparator")) {
			return new Cumparator();
		} else if (tipPersoana.equalsIgnoreCase("Angajat")) {
			return new Angajat();
		}
		return null;
	}

}
