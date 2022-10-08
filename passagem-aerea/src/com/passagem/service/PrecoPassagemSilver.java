package com.passagem.service;

import com.passagem.aerea.Voo;

public class PrecoPassagemSilver implements CalculadorPrecoPassagem{

	@Override
	public double calcular(Voo voo) {
		if (voo.getPreco() > 700.0) 
			return voo.getPreco() * 0.9;
		return voo.getPreco() * 0.94;
	}

}
