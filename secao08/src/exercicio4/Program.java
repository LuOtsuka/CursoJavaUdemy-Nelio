package exercicio4;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CurrencyConverter dollar = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		dollar.price = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		dollar.quantity = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais: R$ %.2f%n", dollar.convert(6));
		
		
		scan.close();
	}
	
	
	

}
