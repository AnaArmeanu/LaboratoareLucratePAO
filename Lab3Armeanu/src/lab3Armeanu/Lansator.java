package lab3Armeanu;

import lab3Armeanu.jucarii.Carte;
import lab3Armeanu.jucarii.Student;
import lab3Armeanu.numarator.ClassCounter;

public class Lansator {
	static  // camp de initializare static
	{
		System.out.println("Static 1"); // se executa fara main, la incarcarea de catre ClassLoader, in ordinea scrisa => nu putem accesa "numar"
	}
	private static int numar = 5;// = 5 => declarare + atribuire
	static 
	{
		System.out.println("Static 2"); // se executa fara main, la incarcarea de catre ClassLoader ; putem accesa " numar" 
	}
	
	{
		System.out.println("Bloc 1");
	}
	private int altNumar = 6;
	{
		System.out.println("Bloc 2");
	}
	
	public Lansator()
	{
		System.out.println("Constructor");
	}
	
	
	
	//************************************************************************************************************************************************************
	public static void main(String args[])
	{
		new Lansator();//la fiecare instantiere se executa blocurile nonstatice
		new Student();
		new Student();
		new Carte();
		System.out.println(ClassCounter.getInstance().getNumar("Student"));
		System.out.println(new Student());//se apeleaza automat toString
		
	}
}
