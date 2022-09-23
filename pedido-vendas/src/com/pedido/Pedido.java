package com.pedido;

public class Pedido {
	
	private double valorTotal = 0;
	private double desconto = 0;

	public void adicionarItem(itemPedido itemPedido) {
		valorTotal = itemPedido.getValorUnitario() * itemPedido.getQuantidade();
	}

	public double valorTotal() {
		return valorTotal;
	}

	public double desconto() {
		return desconto;
	}

}
