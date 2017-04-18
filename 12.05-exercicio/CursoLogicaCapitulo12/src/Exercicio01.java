import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Exercicio01 {

	public static void main(String[] args) throws IOException, EmailException {
		Path arquivo = Paths.get("/tmp/nomes.txt");
		
		List<String> nomes = Files.readAllLines(arquivo);
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		for(int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			
			Aluno aluno = new Aluno();
			aluno.nome = nome;
			
			listaAlunos.adicionar(aluno);
		}
		
		listaAlunos.ordenar();
		
		String mensagem = "Os alunos são: \n"; // Lembrando que o código "\n" é para indicar que a linha encerrou e a próxima parte da String será impressa na linha posterior.
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno aluno = listaAlunos.obter(i);
			mensagem += (i + 1) + ". " + aluno.nome + "\n";
		}
		
		enviarEmail("alexandre.afonso@algaworks.com", "Lista de alunos", mensagem);
		
		System.out.println("Enviado!");
	}
	
	static void enviarEmail(String para, String assunto, String msg) throws EmailException {
		Email email = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("cursologica.algaworks", "!@#$%qwert"));
		email.setSSLOnConnect(true);
		email.setFrom("Curso Lógica <cursologica.algaworks@gmail.com>");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		
		email.send();
	}
}