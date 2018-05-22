package lab10;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class LansatorClient {
	private String nume;
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		

		Socket socket = new Socket("localhost", 12345);
		InputStream i = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(i);
		
		Runnable run = new Runnable() {
		    public void run()
				{

		    		while(true)
		    		{
		    			try {
		    			Mesaj m = (Mesaj) ois.readObject();
		    			System.out.println(m.getMesaj());
		    			}
		    			
		    			catch(Exception e) 
		    			{
		    				e.printStackTrace();
		    			}
		    		}
				}
										};
		
		Thread thread = new Thread(run);
		thread.start();
		Mesaj m1 = new Mesaj();
		OutputStream o = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(o);
		oos.writeObject(m1);
}

}
