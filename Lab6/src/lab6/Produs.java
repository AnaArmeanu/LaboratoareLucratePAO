package lab6;

public interface Produs {
	double getPret();//metodele sunt publice si abstracte de la mama lor
	default void vinde()
	{
		System.out.println(getPret());
	}
}
