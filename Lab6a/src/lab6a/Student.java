package lab6a;

public class Student extends Persoana {

	private int an;
	public Student(String nume, String prenume) {
		super(nume, prenume);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int compareTo(Persoana p) {
		if(p instanceof Profesor)//student cu profesor
			return -1;//profesorii sunt cei mai mari
		if(p instanceof Student) {//student cu student
					int rez = super.compareTo(p);
					if(rez == 0)
						return an - ((Student)p).an;
					return rez;
		}
		//student cu persoana
		return super.compareTo(p);
	}
	//A comparat cu B 
		//>0 => A>B
	   // <0 => A<B

}
