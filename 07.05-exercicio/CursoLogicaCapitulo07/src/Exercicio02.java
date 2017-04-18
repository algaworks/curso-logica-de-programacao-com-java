
public class Exercicio02 {

	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
		
		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double maiorFaturamento = 0.0;
		Integer semanaGanhadora = null; 
		
		for (int i = 0; i < mes.length; i++) {
			Double[] semana = mes[i];
			
			Double faturamentoSemana = 0.0;
			
			for (int y = 0; y < mes.length; y++) {
				faturamentoSemana += semana[y];
			}
			
			Boolean esseFaturamentoEOMaior = faturamentoSemana > maiorFaturamento;
			
			if (esseFaturamentoEOMaior) {
				maiorFaturamento = faturamentoSemana;
				semanaGanhadora = i + 1; // Estou somando com um, pois, não quero mostrar de 0 a 3 e sim de 1 a 4.
			}
		}

		System.out.println("A semana " + semanaGanhadora + " teve o maior faturamento que foi de " + maiorFaturamento + ".");
	}
}