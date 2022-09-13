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
		assertEquals(5, media.mediaFinal(), 0.0001);
	}

}

