package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hInicial, hFinal;
		System.out.println("Digite o horário de início do jogo: ");
		hInicial = sc.nextInt();
		
		System.out.println("Digite o horário de fim do jogo: ");
		hFinal = sc.nextInt();

		int hTotal = 0;
		
		if (hInicial < hFinal) {
			hTotal = hFinal - hInicial;
		}else if(hInicial >= hFinal) {
			hTotal = (24 - hInicial) + hFinal;
		}else {
			System.out.println("O jogo deve ter uma duração mínima de 1 hora e máxima de 24 horas");
		}
		
		System.out.println("O jogo durou " + hTotal + " hora(s)");
		
		sc.close();
	}
}
