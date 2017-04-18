
public class AlgoritmoAvancado { // <<<< Na aula, essa classe foi criada com o nome AlgoritmoAvando.

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		lista.adicionar(aluno3);
		
		Aluno aluno4= new Aluno();
		aluno4.nome = "Normandes";
		lista.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		lista.adicionar(aluno5);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("--------------------------");
		
		lista.remover(aluno3);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}
	}

}
