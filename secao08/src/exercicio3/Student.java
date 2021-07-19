package exercicio3;

public class Student {

	String name;
	double grade1;
	double grade2;
	double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String isApproved() {
		String result;
		double missingPoints;
		if(this.finalGrade() >= 60) {
			result = "Pass";
		}else {
			missingPoints = 60 - this.finalGrade();
			result = "Failed \nMissing " + missingPoints + " points";
		}
		
		return result;
	}
}
