/*package lab4.date;

public class Student extends Persoana {
	private int an;

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}
	public String toString()
	{
		return super.toString() + " ( an "+ an+" )";
	}
	@Override
	 public String getElementType()
	 {
		 return "Student";
	 }
	@Override
	 public String[] getDataFieldNames()
	 {
	    return new String[] {"Nume", "Prenume", "An"};
	 }
	@Override
	public void setFieldAt(int arg0, String arg1) {
		switch(arg0)
		{
		case 0:
			setNume(arg1);
			break;
		case 1:
			setPrenume(arg1);
			break;
		case 2: 
			an = Integer.parseInt(arg1);
			break;
			
		}
		
	}
	@Override
	public String getName() {
		return getPrenume();
	}
	
	@Override
	public String getType() {
		return "Student an: "+an;
	}
}*/