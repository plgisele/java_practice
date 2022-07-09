package util;

public class Calculator {
	
	//final para indicar que � uma constante (n�o muda) - tudo letra mai�scula
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
		
		
}
