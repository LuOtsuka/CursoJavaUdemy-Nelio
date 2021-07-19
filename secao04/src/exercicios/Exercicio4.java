package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		Scanner sc = new Scanner(System.in);
		
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER: " + numFuncionario);
		System.out.printf("SALARY: U$ %.2f", salario);
		
		sc.close();
		
	}
}
