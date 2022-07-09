package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = leitor.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = leitor.nextDouble();
		
		double result = CurrencyConverter.inReais(dollar, amount);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		leitor.close();

	}

}
