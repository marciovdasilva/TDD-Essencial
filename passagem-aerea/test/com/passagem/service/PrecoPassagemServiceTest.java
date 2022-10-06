package com.passagem.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.passagem.aerea.Passageiro;
import com.passagem.aerea.TipoPassageiro;
import com.passagem.aerea.Voo;

public class PrecoPassagemServiceTest {
	
	private PrecoPassagemService precoPassagemService; 
	
	@Before
	public void setup() {
		precoPassagemService = new PrecoPassagemService();
	}
	
	private void assertValorPassagem(Passageiro passageiro, Voo voo, double esperado) {
		double valor = precoPassagemService.calcular(passageiro, voo);
		assertEquals(esperado, valor, 0.0001);
	}
	
	@Test
	public void deveCriarPecoPassagemService() throws Exception {
		PrecoPassagemService precoPassagemService = new PrecoPassagemService();
	}
	
	@Test
	public void devePermitirChamarCalculoDoValor() throws Exception {
//		PrecoPassagemService precoPassagemService = new PrecoPassagemService();
		
		Passageiro passageiro = new Passageiro("Marcio", TipoPassageiro.GOLD);
		Voo voo = new Voo("Cascavel", "Egito", 1000.0);
		double valor = precoPassagemService.calcular(passageiro, voo);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroGold_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Marcio", TipoPassageiro.GOLD);
		Voo voo = new Voo("Cascavel", "Egito", 100.0);
		
		assertValorPassagem(passageiro, voo, 90.0);
	}

	@Test
	public void deveCalcularValorPassagemParaPassageiroGold_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Marcio", TipoPassageiro.GOLD);
		Voo voo = new Voo("Cascavel", "Egito", 600.0);
//		double valor = precoPassagemService.calcular(passageiro, voo);
//		assertEquals(510.0, valor, 0.0001);
		
		assertValorPassagem(passageiro, voo, 510.0);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroSilver_ComValorAbaixoDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Marcio", TipoPassageiro.SILVER);
		Voo voo = new Voo("Cascavel", "Egito", 100.0);
//		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertValorPassagem(passageiro, voo, 94.0);
	}
	
	@Test
	public void deveCalcularPrecoParaPassageiroSilver_ComValorAcimaDoLimite() throws Exception {
		Passageiro passageiro = new Passageiro("Marcio", TipoPassageiro.SILVER);
		Voo voo = new Voo("Cascavel", "Egito", 800.0);
//		double valor = precoPassagemService.calcular(passageiro, voo);
		
		assertValorPassagem(passageiro, voo, 720.0);
	}
}













