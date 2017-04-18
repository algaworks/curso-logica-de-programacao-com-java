import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento para esse ano: ");
		Double meta = scanner.nextDouble();
		
		System.out.print("Digite o faturamento: ");
		Double faturamento = scanner.nextDouble();
		
		System.out.print("Digite a média salarial dos últimos 12 meses: ");
		Double mediaSalarial = scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta * 80) / 100;
		
		Boolean bateuAMeta = faturamento >= meta;
		
		Boolean faturouPeloMenosOitentaPorCento = faturamento >= oitentaPorCentoDaMeta;
		
		if (bateuAMeta) {
			System.out.println("Você vai ganhar um bônus de 100%! Ele será de: " + mediaSalarial);
		} else if (faturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100; // Esse cálculo só precisa ser feito se a meta NÃO tiver sido batida e, por isso, ele ficou aqui.
			
			System.out.println("Você vai ganhar um bônus de 80%! Ele será de: " + oitentaPorCentoDaMediaSalarial);
		} else {
			System.out.println("Infelizmente, esse ano não tem bônus!");
		}		
		
		scanner.close();
	}
}