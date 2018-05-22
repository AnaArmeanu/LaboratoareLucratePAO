package lab4.date;

import com.neuralsoft.pao.ppldatabase.objects.DatabaseElement;

public abstract class Animal extends DatabaseElement{
	private String nume;
	
	//getter si setter
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
//
	
	public String toString()
	{
		return nume;
	}
	
}