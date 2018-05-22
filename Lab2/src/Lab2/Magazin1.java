package Lab2;
import java.util.Arrays;
import java.util.Scanner;

import Lab2.date.Client;//ctrl+shift+o scrie automat importurile
import Lab2.date.ProdusCumparat;
public class Magazin1 {
	private Client[] clienti;
	private ProdusCumparat[][] produseCumparate;
	public int gasesteClient(String nume)
	{
		for(int i=0; i< clienti.length; i++)
		{
			//if(nume == clienti[i].getNume())//face egal intre pointeri(adresele lor)
			if(nume.equals(clienti[i].getNume()))
			{
				return i;
			}
		}
		return -1;
	}

	public Client userNou(String nume)
	{
		//folosim clasa Arrays care contine o metoda ce face o copie a unui array+ redimensionare
		//clienti = Arrays.copyOf(clienti, clienti.length+1); merge si asa
		//pe ultima pozitie are null
		
		//demonstrativ
		Client[] clientCopie ;
		
		if(clienti!=null) {
		clientCopie = Arrays.copyOf(clienti, clienti.length+1);
		clientCopie[clientCopie.length-1] = new Client();//apelam constructorul pentru ca avem null pe pozitia lui
		clientCopie[clientCopie.length-1].setNume(nume);
		clienti = clientCopie;}
		else
		{
			clienti= new Client[1];
			clienti[0] = new Client();
			clienti[0].setNume(nume);
		}
		
		return clienti[clienti.length-1];
		
	}
	public void clientCumpara(String nume, String numeProdus, int cantitate)
	{
		int pozClient = gasesteClient(nume);
		if(pozClient == -1)
		{
			userNou(nume);
		}
		else
		{
			;
		}
		boolean gasitProdus = false;
		//ProdusCumparat[pozClient]//array-ul cu produsele cumparate de userul repectiv
		for(int i=0;i<produseCumparate[pozClient].length; i++)
		{
			if(produseCumparate[pozClient][i].getNume().equals(numeProdus))
			{
				gasitProdus = true;
				produseCumparate[pozClient][i].setCantitate(produseCumparate[pozClient][i].getCantitate()+cantitate);
				break;
			}
			else
			{
				;
			}
			
		}
		if(gasitProdus == false)
		{
			produseCumparate[pozClient] = Arrays.copyOf(produseCumparate[pozClient], pozClient+1);
			produseCumparate[pozClient][produseCumparate[pozClient].length-1] = new ProdusCumparat();
			produseCumparate[pozClient][produseCumparate[pozClient].length-1].setCantitate(cantitate);
			
		}
	}
	public void afisClienti()
	{
		Client[] copie = Arrays.copyOf(this.clienti, this.clienti.length);
		Arrays.sort(copie);
		for(int i=0;i<copie.length;i++) 
		{
			System.out.println(copie[i].getNume());
		}
			
	}
	public void cineCumpara()
	{
		System.out.println("Cine cumpara?");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		System.out.println("Ce cumpara?");
		String b = scanner.next();
		System.out.println("Cat cumpara?");
		int c = scanner.nextInt();
		this.clientCumpara(a, b, c);
		scanner.close();
	}
	public void Nou()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduceti numele clientului: ");
		String a = scanner.next();
		this.userNou(a);
		//scanner.close();
	}
	
	public static void main(String args[])
	{
		Magazin1 ob = new Magazin1();
		System.out.println("Introduceti o optiune: ");
		System.out.println("\t 1 Afisare clienti");
		System.out.println("\t 2 Adaugare cumparaturi ");
		System.out.println("\t 3 Adaugare client ");
		Scanner scanner = new Scanner(System.in);
		int alegere = scanner.nextInt();
		while(alegere!=0) {
		switch(alegere)
		{
		case 1: 
			ob.afisClienti();
			break;
		case 2:
			ob.cineCumpara();
			break;
		case 3: 
			ob.Nou();
			break;
		default:
			break;
		}
		 alegere = scanner.nextInt();}
		scanner.close();
	}
}
