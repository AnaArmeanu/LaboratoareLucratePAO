package lab6a;

public class Profesor extends Persoana {
	private Grad grad;

	public Profesor(String nume, String prenume) {
		super(nume, prenume);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Persoana p) {
		return 1;//nu trebuie asa, ca exemplu tabla; dar lipsa de timp
	}
}
