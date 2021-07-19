package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int codigoItem, quantidadeItem;
		double valorItem, valorTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o código do item que deseja comprar?");
		codigoItem = sc.nextInt();
		
		System.out.println("E qual a quantidade?");
		quantidadeItem = sc.nextInt();

		switch (codigoItem) {
		case 1:
			valorItem = 4.00;
			break;
		case 2:
			valorItem = 4.50;
			break;
		case 3:
			valorItem = 5.00;
			break;
		case 4:
			valorItem = 2.00;
			break;
		case 5:
			valorItem = 1.50;
			break;
		default:
			valorItem = 0.00;
			System.out.println("Desculpe, não temos esse Item disponível");
			break;
		}
		valorTotal = quantidadeItem * valorItem;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		sc.close();
	}
}
