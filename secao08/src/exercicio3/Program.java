package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = scan.nextLine();
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		System.out.println(student.isApproved());
		
		scan.close();
	}
}
