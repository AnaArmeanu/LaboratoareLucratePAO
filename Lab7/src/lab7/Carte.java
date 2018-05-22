package lab7;

import java.io.Serializable;

public class Carte implements Serializable{
	private String titlu;
	private Coperta cop;
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public Coperta getCop() {
		return cop;
	}
	public void setCop(Coperta cop) {
		this.cop = cop;
	}
	public Pagina[] getPag() {
		return pag;
	}
	public void setPag(Pagina[] pag) {
		this.pag = pag;
	}
	private Pagina[] pag;
	
	
}
