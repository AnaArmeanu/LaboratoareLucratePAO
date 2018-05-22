package lab4;

import com.neuralsoft.pao.ppldatabase.MainWindow;

import lab4.date.Caine;
import lab4.date.Pisica;

public class Lansator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nu invatam
		MainWindow fereastra = new MainWindow();
		fereastra.addElementType(Caine.class);
		fereastra.addElementType(Pisica.class);
		fereastra.show();
		
	}

}