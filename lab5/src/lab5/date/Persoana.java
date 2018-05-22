package lab5.date;

public abstract class Persoana {
	protected String nume;
	protected String prenume;
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
	
	public abstract double calculSalariu();
}