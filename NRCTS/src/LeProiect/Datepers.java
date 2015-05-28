package LeProiect;


public interface Datepers {
		public void afisareCumparator();
		public singleton getsingleton();
		public void setNume(String string);
		public void setPrenume(String string);
		public void setGen(String string);
		public void setVarsta(float parseFloat);
		public String getNume();
		public String getPrenume();
		public String getGen();
		public float getVarsta();
		public void creareDatepers(String nume, String pernume,
				String gen, float varsta);
		public void afisareDatepers();
}
