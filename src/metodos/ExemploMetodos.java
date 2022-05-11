package metodos;

public class ExemploMetodos {
	

	public static double somar(Double valor1, Double valor2) {
		return (valor1 + valor2);
	}
	
	public static double subtrair(Double valor1, Double valor2) {
		return (valor1 - valor2);
	}
	
	public static double multiplicar(Double valor1, Double valor2) {
		return (valor1 * valor2);
	}
	
	public static double dividir(Double valor1, Double valor2) {
		return (valor1 / valor2);
	}
	
	public static void main(String[] args) {
		
		System.out.print("Método Somar = ");
		// Altere os valores
		System.out.println(somar(5.0, 6.5));
		
		System.out.print("Método subtrair = ");
		// Altere os valores
		System.out.println(subtrair(5.0, 2.0));
		
		System.out.print("Método multiplicar = ");
		// Altere os valores
		System.out.println(multiplicar(5.0, 2.0));
		
		System.out.print("Método dividir = ");
		// Altere os valores
		System.out.println(dividir(8.0, 2.0));
		
	}
}
