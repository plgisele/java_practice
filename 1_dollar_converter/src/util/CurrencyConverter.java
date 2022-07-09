package util;

public class CurrencyConverter {
	public static double IOF = 0.06;

	public static double inReais(double dollar, double amount) {
		return amount * dollar * (1.0 + IOF);
	}
}