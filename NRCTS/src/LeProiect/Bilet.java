package LeProiect;

public class Bilet {
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
	public int getNr_bilete() {
		return nr_bilete;
	}
	public void setNr_bilete(int nr_bilete) {
		this.nr_bilete = nr_bilete;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	private String film;
	private int pret;
	private int loc;
	private int nr_bilete;
	private int cantitate;

	public int costbilet(int pret, int cantitate) {
		int cost= pret*cantitate;
		return cost;
	};
}


