package lab3Armeanu.jucarii;

import lab3Armeanu.numarator.ClassCounter;

public class Student {
	
		private String nume;
		private String prenume;
		private Student prieten;
		
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
		
		public Student() 
		{
			ClassCounter.getInstance().instantaNoua("Student");
			
		}
		public String toString() 
		{
			return "Studentul se numeste "+nume+", "+prenume;
		}
		
		public Student (Student a)
		{
			
			this.nume = a.nume; //ca sunt in clasa mea
			this.prenume = a.prenume;
			//Shallow Copy
			//this.prieten = a.prieten; //se apeleaza constr. de copiere? NU
			//Deep Copy
			this.prieten = new Student(prieten);
		}
}
