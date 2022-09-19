import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ValidarMediaFinalTest {

	private Media media;
	
	@Before
	public void setup() {
		media = new Media();		
	}

	@Test
	public void receberNotasParaMediaFinal() throws Exception {
//		Media media = new Media();
	}
	
	@Test
	public void informaNotaParaCalcularMedia() throws Exception {
		media.informaNota(7.00, 8.00);
	}
	
	@Test
	public void calculaMediaFinalParaAlunoSemNotas() throws Exception {
		assertEquals(0, media.mediaFinal(), 0.0001);
	}
	
	@Test
	public void calculaMediaFinalParaAlunoComNotas() throws Exception {
		assertNotas((int) 0.0, (int) 0.0);
	}

	private void assertNotas(int nota1, int nota2) {
		media.informaNota(5.5, 6.5);
		
		assertEquals(nota1, media.mediaFinal(), 0.0001);
		assertEquals(nota2, media.mediaFinal(), 0.0001);
	}
	
	

}

