package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hInicial, hFinal;
		System.out.println("Digite o hor�rio de in�cio do jogo: ");
		hInicial = sc.nextInt();
		
		System.out.println("Digite o hor�rio de fim do jogo: ");
		hFinal = sc.nextInt();

		int hTotal = 0;
		
		if (hInicial < hFinal) {
			hTotal = hFinal - hInicial;
		}else if(hInicial >= hFinal) {
			hTotal = (24 - hInicial) + hFinal;
		}else {
			System.out.println("O jogo deve ter uma dura��o m�nima de 1 hora e m�xima de 24 horas");
		}
		
		System.out.println("O jogo durou " + hTotal + " hora(s)");
		
		sc.close();
	}
}
