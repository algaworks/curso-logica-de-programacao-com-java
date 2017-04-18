import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;			
		}
		
		if (operacao.equals(3)) {
			resultado = primeiroNumero / segundoNumero;			
		}
		
		if (operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;			
		}
		
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}

}
