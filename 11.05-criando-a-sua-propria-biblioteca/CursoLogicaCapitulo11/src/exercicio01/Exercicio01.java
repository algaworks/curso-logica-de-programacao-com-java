package exercicio01;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.mail.EmailException;

import console.Interacao;

public class Exercicio01 {

	public static void main(String[] args) throws IOException, EmailException {
		Interacao interacao = new Interacao();

		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) { // Deixei o true como condição do laço, pois, o que vai pará-lo é o fato do usuário digitar o "x" no console.
			tarefa = interacao.lerLinha("Tarefa " + i + ": ");
			
			if ("x".equals(tarefa)) {
				break; // Essa é a única maneira de parar esse laço.
			}

			linhas.add(tarefa);
			i++;
		}

		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n"; 
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;

		String para = interacao.lerLinha("Digite seu e-mail: "); 
				
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		interacao.imprimir("Fim...");
		
		interacao.fechar();
	}
}