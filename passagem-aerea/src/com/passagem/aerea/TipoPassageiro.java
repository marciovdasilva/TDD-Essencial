package com.passagem.aerea;

import com.passagem.service.CalculadorPrecoPassagem;
import com.passagem.service.PrecoPassageiroGold;
import com.passagem.service.PrecoPassagemSilver;

public enum TipoPassageiro {
	
	GOLD(new PrecoPassageiroGold()),
	SILVER(new PrecoPassagemSilver());
	
	CalculadorPrecoPassagem calculadorPrecoPassagem;
	
	private TipoPassageiro(CalculadorPrecoPassagem calculadorPrecoPassagem) {
		this.calculadorPrecoPassagem = calculadorPrecoPassagem;
	}
	
	public CalculadorPrecoPassagem getCalculadora() {
		return calculadorPrecoPassagem;
	}
	
	
}
