package exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter a rectangle width and height: ");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());
		
		scan.close();

	}

}
