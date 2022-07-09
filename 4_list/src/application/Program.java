package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int number = sc.nextInt();
		
		for(int i=1; i <= number; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.print("This Id already exists. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.print("Enter the employee Id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(employee == null) {
			System.out.println("Id doesn't exist.");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		System.out.println();
		
		System.out.println("List of Employees:");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}

}
