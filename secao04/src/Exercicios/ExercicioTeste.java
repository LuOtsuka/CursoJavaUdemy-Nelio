package Exercicios;

public class ExercicioTeste {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf(product1 + ", which price is $ %.2f%n", price1);
		System.out.printf(product2 + ", which price is $ %.2f%n", price2);

		System.out.printf("%nRecord: %d years old, code %d and gender: %c%n", age, code, gender);

		System.out.printf("%nMeasure with eight decimal places: %.8f", measure);
		System.out.printf("%nRouded (three decimal places): %.3f", measure);

	}

}
