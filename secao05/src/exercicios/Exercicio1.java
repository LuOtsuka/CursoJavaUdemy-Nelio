package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O número '" + numero + "' é positivo.");
		}else {
			System.out.println("O número '" + numero + "' é negativo.");
		}

	}

}
