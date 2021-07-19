package exercicio1;

public class Rectangle {
	
	double width;
	double height;
	
	public double area() {
		
		return width * height;
		
	}
	
	public double perimeter() {
		
		return (height * 2) + (width * 2);
		
	}
	
	public double diagonal() {
		
		return Math.sqrt((width * width) + (height * height));
		
	}

}
