package com.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
//	private double valorTotal = 0;
//	private double desconto = 0;
	
	private List<ItemPedido> itens = new ArrayList<>();

	public void adicionarItem(ItemPedido itemPedido) {
//		valorTotal += itemPedido.getValorUnitario() * itemPedido.getQuantidade();
		itens.add(itemPedido);
	}

	public double valorTotal() {
//		valorTotal += ItemPedido.getValorUnitario() * ItemPedido.getQuantidade();
//		return valorTotal;
		
		return itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		
	}

	public double desconto() {
		double desconto = 0;
		double valorTotal = valorTotal();
		
		if (valorTotal > 300.0) {
			desconto = valorTotal * 0.04;
		} 
		
		return desconto;
	}
	

}
