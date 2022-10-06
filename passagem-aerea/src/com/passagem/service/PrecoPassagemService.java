package com.passagem.service;

import com.passagem.aerea.Passageiro;
import com.passagem.aerea.TipoPassageiro;
import com.passagem.aerea.Voo;

public class PrecoPassagemService {

	public double calcular(Passageiro passageiro, Voo voo) {
		if (passageiro.getTipo().equals(TipoPassageiro.GOLD)) {
			if (voo.getPreco() > 500) 
				return voo.getPreco() * 0.85;					
			return voo.getPreco() * 0.9;
		}	
		else if (passageiro.getTipo().equals(TipoPassageiro.SILVER)) {
			if (voo.getPreco() > 700.0) 
				return voo.getPreco() * 0.9;
			return voo.getPreco() * 0.94;
		}	
		
		throw new TipoPassageiroInvalidoException();
	}

}
