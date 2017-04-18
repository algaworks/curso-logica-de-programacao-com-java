import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número referente ao dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();
		
		String dia;
		
		switch (diaDaSemana) {
		case 1: dia = "domingo";
			break;
		case 2: dia = "segunda-feira";
			break;
		case 3: dia = "terça-feira";
			break;
		case 4: dia = "quarta-feira";
			break;
		case 5: dia = "quinta-feira";
			break;
		case 6: dia = "sexta-feira";
			break;
		case 7: dia = "sábado";
			break;
		default: dia = "INVÁLIDO";
		}
		
		System.out.println("O dia escolhido foi: " + dia);
		
		scanner.close();
	}
}