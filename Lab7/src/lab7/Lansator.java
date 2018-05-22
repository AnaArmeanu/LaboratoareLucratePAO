package lab7;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lansator {

    final static Charset ENCODING = StandardCharsets.UTF_8; //pt citire text 
	static private Carte[] vectCarte;
	//TOATE PRIMITIVELE IMPLEMENTEAZA DEJA SERIALIZABLE, chiar si clasa Exception
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{

		vectCarte = new Carte[1];
		vectCarte[0] = new Revista();
		vectCarte[0].setCop(new Coperta());
		vectCarte[0].setTitlu("Alice in Tara Minunilor-Sper sa iau nota buna");
		
		try {
			salveaza();
		} 
		catch (FileNotFoundException e)//ca sa tratam exceptia FNF separat de IO
		{
			e.printStackTrace();
		} 
		catch(NullPointerException e)
		{
			System.out.println("Null");
		}
		
	    //citire text	
		List<String> linii; 
		Path path = Paths.get("f2.txt");
		linii = Files.readAllLines(path,ENCODING);
		for(String a:linii)
		{
			System.out.println(a);
		}
		//citire text
		
		
		//DESERIALIZARE
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fisier.bin"));)
		{
			Carte[] citit = (Carte[]) ois.readObject();	
			System.out.println(citit[0].getClass().getSimpleName());
			System.out.println(citit[0].getTitlu());
		}	
	}
	
	
	
	public static void salveaza() throws IOException {
		//stream-urile se inchid automat la iesirea din try
		//SERIALIZARE
		try(FileOutputStream f = new FileOutputStream("fisier.bin");
			ObjectOutputStream oos = new ObjectOutputStream(f);) 
		{
		     //numele sau calea fisierului
			//2 tipuri de exceptii: tratate (trebuie sa ne ocupam de ele) si netratate (se pot ignora)
		   //tratam exceptia pentru FileNotFound care da de fapt exceptie ca nu gaseste directorul 
		oos.writeObject(vectCarte);
		}

		//scriem text
		try(FileOutputStream f = new FileOutputStream("f2.txt");
				DataOutputStream o = new DataOutputStream(f);) 
			{

         			o.writeBytes("I'm your first line\n");
         			o.writeBytes("Hello");
			}

	}

}
