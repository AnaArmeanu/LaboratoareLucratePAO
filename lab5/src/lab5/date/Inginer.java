package lab5.date;

public class Inginer extends Angajat {

	public double calculSalariu() 
	{
		return salariu_db * (1+vechime/12);
	}
}