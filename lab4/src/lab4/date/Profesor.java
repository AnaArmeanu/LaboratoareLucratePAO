/*package lab4.date;

public class Profesor extends Persoana {
	private String disciplina;
	public String toString()
	{
		return super.toString() + " ( " + disciplina + " )";
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	 public String getElementType()
	 {
		 return "Profesor";
	 }
	 
		@Override
		 public String[] getDataFieldNames()
		 {
		    return new String[] {"Nume", "Prenume", "Disciplina"};
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
				disciplina = arg1;
				break;
			}
			
		}
		@Override
		public String getName() {
			return getNume();
		}
		
		@Override
		public String getType() {
			return "Profesor "+disciplina;
		}
}*/