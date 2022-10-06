package com.passagem.aerea;

public class Passageiro {
	
	private String nome;
	private TipoPassageiro tipo;

	public Passageiro(String nome, TipoPassageiro tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String nome) {
		this.nome = nome;
	}

	public TipoPassageiro getTipo() {
		return tipo;
	}

	public void setTipo(TipoPassageiro tipo) {
		this.tipo = tipo;
	}

}