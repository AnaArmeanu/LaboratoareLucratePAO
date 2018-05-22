package lab6;

public abstract class Animal implements Produs{
	//interfetele se mostenesc in copii
	private int varsta;
	
}
/*
 * Animal a = new Caine(); ok
 * Produs b = new Caine(); ok
 * a = b; NU
 * b = a; DA
 * a.vinde() b.vinde() e ok
 * Caine c = b; NU, dar se poate face cast ca e de tip caine Caine c = (Caine)b;
 * Pisica p = b; NU
 * 
 * if(b instanceof Pisica) => ok; se foloseste foarte des
 * {
 * 		Pisica p = b;
 * }
 * 
 *  if(b instanceof Produs) 
 */