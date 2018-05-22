package lab9;

import java.io.Serializable;

public class Student  implements Serializable {
	private String nume;
	private String prenume;
	private int note;
	
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
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}


}