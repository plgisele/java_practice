package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int aNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String aHolder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char dAnswer = sc.nextLine().charAt(0); 
		
		if (dAnswer == 'y') {
			System.out.print("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(aNumber, aHolder, initialDeposit); 
		} else {
			account = new Account(aNumber, aHolder);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
