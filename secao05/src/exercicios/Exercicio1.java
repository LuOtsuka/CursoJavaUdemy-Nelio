package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("O n�mero '" + numero + "' � positivo.");
		}else {
			System.out.println("O n�mero '" + numero + "' � negativo.");
		}

	}

}
