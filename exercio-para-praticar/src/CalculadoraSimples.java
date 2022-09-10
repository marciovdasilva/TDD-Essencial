public class CalculadoraSimples {
	public int adicao(int valorA, int valorB) {
		return valorA + valorB;
	}

	public int subtracao(int valorA, int valorB) {
		return valorA - valorB;
	}

	public int multiplicacao(int valorA, int valorB) {
		return valorA * valorB;
	}

	public int divisao(int dividendo, int divisor) {
		
		if (divisor == 0) {
			System.out.println("Não existe divisão por Zero.");
			return 1;
		} else {
			return dividendo / divisor;			
		}

	}
	
	
	
}