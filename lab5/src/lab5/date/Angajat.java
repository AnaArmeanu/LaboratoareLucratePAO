package lab5.date;

public abstract class Angajat extends Persoana {
	
	protected int vechime;
	protected double salariu_db;

	public int getVechime() {
		return vechime;
	}
	public void setVechime(int vechime) {
		this.vechime = vechime;
	}
	public double getSalariu_db() {
		return salariu_db;
	}
	public void setSalariu_db(double salariu_db) {
		this.salariu_db = salariu_db;
	}
	//public abstract double calculSalariu(); nu e oblig
}