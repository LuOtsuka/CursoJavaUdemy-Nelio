package exercicio2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = scan.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = scan.nextDouble();
		System.out.println("Tax: ");
		employee.tax = scan.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Wich percentage to increase salary? ");
		double percentage = scan.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		
		scan.close();
	}
}
