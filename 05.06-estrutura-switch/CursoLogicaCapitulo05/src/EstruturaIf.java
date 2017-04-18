
public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficenteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
//				&& aContaTemTempoSuficenteDeAbertura && temNomeLimpo;
		
		if (((movimentacaoMedia * 2) >= emprestimo) 
				&& aContaTemTempoSuficenteDeAbertura && temNomeLimpo) {
			System.out.println("Sim! Pode liberar empréstimo.");
		} else {
			System.out.println("Não pode liberar o empréstimo.");
		}
	}

}
