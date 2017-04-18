import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo os valores gastos com...");
		
		Double total = 0.0;
		
		System.out.print("Luz: ");
		total += scanner.nextDouble();
		
		System.out.print("Água: ");
		total += scanner.nextDouble();
		
		System.out.print("Telefone: ");
		total += scanner.nextDouble();
		
		System.out.print("Escola: ");
		total += scanner.nextDouble();
		
		System.out.print("Cartão: ");
		total += scanner.nextDouble();
		
		System.out.print("Supermercado: ");
		total += scanner.nextDouble();
		
		System.out.println("O gasto total foi de: " + total);
		
		scanner.close();
	}

}
