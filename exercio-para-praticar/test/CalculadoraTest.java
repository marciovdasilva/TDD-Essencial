import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

	private CalculadoraSimples calculadora;
	
	@Before
	public void setup() {
		calculadora = new CalculadoraSimples();		
	}
	
	@Test
	public void adicaoSimples() throws Exception {
        int valorA = 15;
        int valorB = 25;
        int total = valorA + valorB;

        int adicao = calculadora.adicao(valorA, valorB);

        assertEquals(total, adicao);
	}
	@Test
	public void subtracaoSimplesMaiorNumeroPrimeiro() throws Exception {
		int valorA = 100;
		int valorB = 50;
		int total = valorA - valorB;
		
		int subtracao = calculadora.subtracao(valorA, valorB);
		
		assertEquals(total, subtracao);
	}
	@Test
	public void subtracaoSimplesMenorNumeroPrimeiro() throws Exception {
		int valorA = 50;
		int valorB = 100;
		int total = valorA - valorB;
		
		int subtracao = calculadora.subtracao(valorA, valorB);
		
		assertEquals(total, subtracao);
	}
	@Test
	public void multiplicacaoSimples() throws Exception {
		int valorA = 2;
		int valorB = 15;
		int total = valorA * valorB;
		
		int multiplicacao = calculadora.multiplicacao(valorA, valorB);
		
		assertEquals(total, multiplicacao);
	}
	@Test
	public void divisaoSimples() throws Exception {
		int dividendo = 10;
		int divisor = 5;
		int total = dividendo / divisor;
		
		int divisao = calculadora.divisao(dividendo, divisor);
		
		assertEquals(total, divisao);
	}
}

