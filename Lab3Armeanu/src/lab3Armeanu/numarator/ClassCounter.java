package lab3Armeanu.numarator;

import java.util.Arrays;

public class ClassCounter {//singleton   !!!!!!!!!!!!!!!!!

	    private static ClassCounter Instance;
	    private Pereche[] perechi;
	    
		private ClassCounter() 
		{
			
		}
		
		public static ClassCounter getInstance() //ClassCounter = tipul functiei 
		{
			if(Instance == null)
				Instance = new ClassCounter();
			return Instance;
		}
		
		public void instantaNoua(String nume)
		{
			if(perechi == null)
			{
			perechi = new Pereche[1];
			//perechi = Arrays.copyOf(perechi, perechi.length+1);
			Pereche PerecheNoua = new Pereche();
			PerecheNoua.setNume(nume);
			PerecheNoua.setNr(1);
			perechi[0] = PerecheNoua;
			return;
			}

			
			for(int i=0 ; i<perechi.length ; i++)
			{
				//if(nume.equals(perechi[i].getNume()))
				if(perechi[i].getNume().equals(nume))
				{
					perechi[i].setNr(perechi[i].getNr()+1);
					return ;
				}
			}
			perechi = Arrays.copyOf(perechi, perechi.length+1);
			Pereche PerecheNoua = new Pereche();
			PerecheNoua.setNume(nume);
			PerecheNoua.setNr(1);
			perechi[perechi.length-1] = PerecheNoua;
			
		}
		
		public int getNumar(String numeClasa)
		{


			for(int i=0; i<perechi.length ;i++)
			{
				if(numeClasa.equals(perechi[i].getNume()))
				{
					return perechi[i].getNr();
				}
			}
			return 0;
		}
		
}
