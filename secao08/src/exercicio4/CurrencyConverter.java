package exercicio4;

public class CurrencyConverter {

	double price;
	double quantity;
	
	public double convert(double iof) {
		return price * quantity + (price * quantity * (iof / 100));
		
	}
}
