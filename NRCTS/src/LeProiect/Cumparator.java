package LeProiect;

public class Cumparator extends PersObj implements Datepers {
	PersObj pers;
	singleton sg;
	
	public String getNume() {
		return pers.getNume();
	}

	public void setNume(String nume) {
		pers.setNume(nume);
	}

	public String getPrenume() {
		return pers.getPrenume();
	}

	public void setPrenume(String prenume) {
		pers.setPrenume(prenume);
	}

	public String getGen() {
		return pers.getGen();
	}

	public void setGen(String gen) {
		pers.setGen(gen);
	}

	public float getVarsta() {
		return pers.getVarsta();
	}

	public void setVarsta(float varsta) {
		pers.setVarsta(varsta);
	}
	

	@Override
	public void afisareCumparator() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public singleton getsingleton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creareDatepers(String nume, String pernume, String gen,
			float varsta) {
		this.nume = nume;
		this.prenume = pernume;
		this.gen = gen;
		this.varsta = varsta;
		
		
	}

	@Override
	public void afisareDatepers() {
		
		System.out.println(this.nume+" "+this.prenume+" "+this.gen+" "+this.varsta);
	}


		
	}



	
