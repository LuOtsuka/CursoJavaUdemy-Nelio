package entities;

public class ContaBancaria {
	
	private final int numeroConta;
	private String titularConta;
	private double saldoConta;
	
	
	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		saldoConta = 0;
	}
	
	public ContaBancaria(int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		depositar(depositoInicial);
	}

	public String getNomeTitularConta() {
		return titularConta;
	}

	public void setNomeTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}

	public void sacar(double valor) {
		this.saldoConta -= (valor + 5.00);
	}
	
	public void depositar(double valor) {
		this.saldoConta += valor;
	}
	
	public String toString() {
		return "\nAccount: " + numeroConta + "\nHolder: " + titularConta + String.format("\nBalance: $ %.2f", saldoConta);
	}
		
}
