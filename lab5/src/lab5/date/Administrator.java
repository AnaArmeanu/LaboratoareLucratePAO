package lab5.date;

public class Administrator extends Persoana{
	public static final double salariu_fix=15000;

	public double calculSalariu() 
	{
		return salariu_fix;
	}
}

//varianta 2 nu e ok pentru vector
/*
 * public class Administrator{
  	private String nume;
	private String prenume;
	public static final double salariu_fix=15000;
	
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
	public double calculSalariu() 
	{
		return salariu_fix;
	}
}
 * */