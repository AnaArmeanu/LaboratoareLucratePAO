package lab6a;

public class Persoana implements Comparable<Persoana>{
	private String nume;
	private String prenume;
	
	public Persoana(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	} 
	
	@Override
	public int compareTo(Persoana p) {
		int rez = nume.compareTo(p.nume);
		if(rez == 0)
			return prenume.compareTo(p.prenume);
		return rez;
	}
}