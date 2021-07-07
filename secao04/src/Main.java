import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		double x = 10.35747;
		
		//Mostrar número com casas decimais
		System.out.println(x);
		
		//Mostrar numero com limite de casas decimais
		System.out.printf("%.2f%n", x);
		System.out.printf("%.3f%n", x);
		//Comando para mudar de , para . dependendo do local que escolher
		Locale.setDefault(Locale.FRENCH);
		System.out.printf("%.3f%n", x);
		
		//teste
		// %s = texto
		// %d = int
		// %f = decimal
		// %n = quebra de linha
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
