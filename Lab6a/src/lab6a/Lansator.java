package lab6a;

import java.util.Arrays;
import java.util.Comparator;

public class Lansator {

	public static void main(String[] args) {
		Persoana[] v = new Persoana[2];
		Arrays.sort(v);//va folosi Comparable
		Arrays.sort(v, new Comparator () {

		@Override
		public int compare(Object a, Object b) {
			if(a instanceof Profesor)
				if(b instanceof Profesor)
					return 0;
				else
					return 1;
			//....
			return 0;
		}} );
		
	}

}
