package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite mais um n�mero: ");
		int numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("Os n�meros s�o m�ltiplos entre si.");
		}else {
			System.out.println("Os n�meros n�o s�o m�ltiplos entre si.");
		}
	}
}
