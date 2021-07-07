package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
		double valorPeca1, valorPeca2, valorTotal;
		
		Scanner sc = new Scanner(System.in);
		
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		valorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		sc.close();
	}
}
