import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		Integer numero = scanner.nextInt();
		
		Integer quadrado = numero * numero;
		
		System.out.println("O quadrado de " + numero + " é " + quadrado + ".");
		
		scanner.close();
	}

}
