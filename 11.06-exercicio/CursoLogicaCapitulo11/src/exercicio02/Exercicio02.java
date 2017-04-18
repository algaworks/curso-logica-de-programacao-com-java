package exercicio02;

import console.Interacao;

public class Exercicio02 {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");;
		
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");;
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		interacao.imprimir("Troco: " + resultado);
		
		interacao.fechar();
	}

}
