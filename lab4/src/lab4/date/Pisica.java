package lab4.date;

public class Pisica extends Animal {
	private int nivel; //ce ar trebui sa aiba o pisica? :))

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int an) {
		this.nivel = nivel;
	}
	public String toString()
	{
		return super.toString() + " ( Nivel de pisica "+ nivel+" )";
	}
	@Override
	 public String getElementType()
	 {
		 return "Pisica";
	 }
	@Override
	 public String[] getDataFieldNames()
	 {
	    return new String[] {"Nume", "Nivel"};
	 }
	@Override
	public void setFieldAt(int arg0, String arg1) {
		switch(arg0)
		{
		case 0:
			setNume(arg1);
			break;
		case 1: 
			nivel = Integer.parseInt(arg1);
			break;
			
		}
		
	}
	@Override
	public String getName() {
		return getNume();
	}
	
	@Override
	public String getType() {
		return "Pisica de nivel: "+nivel;
	}
}