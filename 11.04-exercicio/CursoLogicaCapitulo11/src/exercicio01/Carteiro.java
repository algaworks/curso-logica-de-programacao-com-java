package exercicio01;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
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
