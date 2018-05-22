package lab4.date;

public class Caine extends Animal {
	private String pedigree;
	public String toString()
	{
		return super.toString() + " ( " + pedigree + " )";
	}

	public String getPedigree () {
		return  pedigree ;
	}

	public void setPedigree (String  pedigree ) {
		this.pedigree = pedigree;
	}
	 public String getElementType()
	 {
		 return "Caine";
	 }
	 
		@Override
		 public String[] getDataFieldNames()
		 {
		    return new String[] {"Nume","Pedigree"};
		 }
		
		@Override
		public void setFieldAt(int arg0, String arg1) {
			switch(arg0)
			{
			case 0:
				setNume(arg1);
				break;
			case 1: 
				pedigree = arg1;
				break;
			}
			
		}
		@Override
		public String getName() {
			return getNume();
		}
		
		@Override
		public String getType() {
			return "Caine "+pedigree;
		}
}