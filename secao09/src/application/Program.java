package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter account number: ");
		int numeroConta = scan.nextInt();
		
		System.out.println("Enter account holder: ");
		scan.nextLine();
		String titularConta = scan.nextLine();
		
		System.out.println("Is there initial deposit? (y / n)");
		char resposta = scan.next().charAt(0);
		
		if(resposta == 'y' || resposta == 'Y') {
			System.out.println("Enter inicial deposit value: ");
			double depositoInicial = scan.nextDouble();
			
			conta1 = new ContaBancaria(numeroConta, titularConta, depositoInicial);
			
		} else {
			conta1 = new ContaBancaria(numeroConta, titularConta);

		}
		
		System.out.println("\nAccount data: " + conta1);
		
		System.out.println("\nEnter a deposit value: ");
		conta1.depositar(scan.nextDouble());
		
		System.out.println("\nUpdated Account data: " + conta1);
		
		System.out.println("\nEnter a withdraw value: ");
		conta1.sacar(scan.nextDouble());
		
		System.out.println("\nUpdated Account data: " + conta1);		
				
		scan.close();
	}

}
