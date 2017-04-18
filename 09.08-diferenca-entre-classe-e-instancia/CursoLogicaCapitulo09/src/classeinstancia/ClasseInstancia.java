package classeinstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto = new Produto();
		produto.nome = "Caneca";
		
//		Produto.quantidadeMinimaEstoque = 11;
//		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		
		System.out.println("Quantidade minima estoque: " + Produto.quantidadeMinimaEstoque);
		
//		System.out.println("Produto 1: " + produto.nome);
//		System.out.println("Produto 2: " + produto2.nome);
		
		Impressao.informacao("Produto 1: " + produto.nome);
		Impressao.informacao("Produto 2: " + produto2.nome);
		
		
		
		
	}

}
