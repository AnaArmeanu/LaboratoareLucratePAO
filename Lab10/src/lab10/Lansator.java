package lab10;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Lansator {

	private static int nr;
	private static List<Mesaj> lista = new ArrayList();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		/*
		for(int i=0;i<20;i++) 
		{
			Runnable run = new Runnable() {
		    public void run()
				{
					for(int i=0;i<1000;i++)
					{
						synchronized(Lansator.class){//this = instanta lui Runnable (nu e ok sa ai 20 de instante de R. <=> nu se asteapta); Lansator.class = obiectul class al lui Lansator
						nr++;//operatia pe care o vrem atomica
						}
					}
					System.out.println(nr);
		    	
				}
										};
		

		    Thread thread = new Thread(run);
            thread.start();
        }*/

		
		ServerSocket ss = new ServerSocket(12346);
		//while(true){
		Socket s = ss.accept();//o singura data => un singur client 1 data
		//new Runnable(){
		OutputStream o = s.getOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(o);
		
		for (Mesaj m : lista)
		{
			os.writeObject(m);
		}
		
		InputStream i = s.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(i);
		
		while(true)
		{
			os.writeObject(ois.readObject());//la deconectare arunca exceptie
			
		}
		//}
		//lanseaza thread
		//}
		
	}

}
