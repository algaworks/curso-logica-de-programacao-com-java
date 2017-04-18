import java.util.Scanner;

public class Exercicio04 {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		System.out.print("Tempo de contribuição: ");
		Integer contribuicao = scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		
		Boolean temTempoDeContribuicaoSuficiente = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;
		
		if (podeAposentar) {
			System.out.println("Sim! Pode aposentar.");
		} else {
			System.out.println("Não vai ser possível aposentar agora.");
		}
		
		scanner.close();
	}

}
