
public class ListaAlunos {
	
	static final int QUANTIDADE_LISTA = 5;
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Aluno aluno) {
		if (tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
			lista = novaLista;
		}
		
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	void remover(Aluno aluno) {
		for (int i = 0; i < tamanhoLista; i++) {
			Aluno a = lista[i];
			
			if (a != null && a.equals(aluno)) {
				remover(i);
				break;
			} else if (a == null && aluno == null) {
				remover(i);
				break;
			}
		}
	}
	
	void remover(int indice) {
		int indiceInicial = indice + 1;
		
		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}
		
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
}