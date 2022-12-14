import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CamelCaseConverterTest {

	private CamelCaseConverter camelCase;
	
	@Before
	public void setup() {
		camelCase = new CamelCaseConverter();		
	}
	
	
	@Test
	public void deveCriarObjetoCamelCaseConverter() throws Exception {
		
	}
	
	@Test
	public void aplicarCamelCaseEmnomeUnico() throws Exception {
		assertEquals("Lionel", camelCase.converter("lionel"));
	}
	
	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() throws Exception {
		assertEquals("Lionel", camelCase.converter("lIOneL"));
		
	}
	
	@Test
	public void deveConverterNomeCompostos() throws Exception {
		assertEquals("Lionel Ronaldo", camelCase.converter("lIOnEl rOnAldo"));
	}
	//Teste do professor Alex Silva 
	@Test
	public void deveConverterNomeCompostos2() throws Exception {
		assertEquals("Alex Augusto Lucas Silva Santos", camelCase.converter("ALEX augusto lucas Silva SANTOS"));
	}
}
