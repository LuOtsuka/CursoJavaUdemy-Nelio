package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valores para as coordenadas x : ");
		x = sc.nextDouble();
		
		System.out.println("Digite valores para as coordenadas y : ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}else if(x == 0) {
			System.out.println("Eixo Y");
		}else if(y == 0) {
			System.out.println("Eixo X");
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y >= 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		
		sc.close();

	}

}