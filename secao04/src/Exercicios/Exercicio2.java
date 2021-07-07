package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double raio, area;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		
		area = pi* (raio*raio);
		
		System.out.printf("A área do círculo é: %.4f", area);
		
		sc.close();

	}

}
