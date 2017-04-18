
public class VetoresMaisDe2Dimensoes {
	
	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFeveriro = new Double[] { 1000.0, 2500.0, 1800.0 };
		
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFeveriro };
		
		Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
		
		Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };
	}
}