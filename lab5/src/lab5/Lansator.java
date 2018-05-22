package lab5;

import lab5.date.Administrator;
import lab5.date.Inginer;
import lab5.date.Medic;
import lab5.date.Persoana;
import lab5.date.Profesor;

public class Lansator {
	public static void main(String args[])
	{
		Persoana v[] = new Persoana[4];
		v[0] = new Administrator();
		v[1] = new Medic();
		v[2] = new Inginer();
		v[3] = new Profesor();
		
		v[0].calculSalariu();//cea din administrator; daca aveam implementare in persoana => tot admin se apela
	}
}
