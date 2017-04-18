
public class AlgoritmoAvancado { // <<<< Na aula, essa classe foi criada com o nome AlgoritmoAvando.

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Thiago";
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4= new Aluno();
		aluno4.nome = "Normandes";
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "João";
		listaAlunos.adicionar(aluno5);
		
		iterar(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterar(listaAlunos);
		
		listaAlunos.remover(aluno3);
		
		iterar(listaAlunos);
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if (a != null) {
				System.out.println("Aluno: " + a.nome);
			} else {
				System.out.println("Aluno sem nome");
			}
		}
		
		System.out.println("--------------------------");
	}

}
