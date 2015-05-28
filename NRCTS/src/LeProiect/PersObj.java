package LeProiect;

public class PersObj implements Cloneable , Datepers{
		String nume;
		String prenume;
		String gen;
		float varsta;
public PersObj(){
	super();
}

public PersObj(String n,String p,String g,float v){
			this.nume=n;
			this.prenume=p;
			this.gen=g;
			this.varsta=v;
			
		}

	// TODO Auto-generated constructor stub


public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public String getPrenume() {
	return prenume;
}

public void setPrenume(String prenume) {
	this.prenume = prenume;
}

public String getGen() {
	return gen;
}

public void setGen(String gen) {
	this.gen = gen;
}

public float getVarsta() {
	return varsta;
}

public void setVarsta(float varsta) {
	this.varsta = varsta;
}
public Object clone()
{
	Object clone=null;
	try{
		clone=super.clone();
	}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
	}
	return clone;
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
public void creareDatepers(String nume, String pernume, String gen, float varsta) {
	this.setNume(nume);
	this.setPrenume(pernume);
	this.setGen(gen);
	this.setVarsta(varsta);
	
}

@Override
public void afisareDatepers() {
	System.out.println(this.nume+" "+this.prenume+" "+this.gen+" "+this.varsta);
	
}
}
