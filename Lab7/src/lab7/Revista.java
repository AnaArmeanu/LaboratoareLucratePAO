package lab7;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Revista extends Carte {//revista mosteneste implementarea serializable din Carte
	private int nr;
	private void writeObject(ObjectOutputStream o) throws IOException
	{
		setTitlu ("abc "+getTitlu());
		o.defaultWriteObject();
	}
}
