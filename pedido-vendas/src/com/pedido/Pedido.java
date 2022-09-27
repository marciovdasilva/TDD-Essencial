package com.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private double valorTotal = 0;
	private double desconto = 0;
	
	private List<ItemPedido> itens = new ArrayList<>();

	public void adicionarItem(ItemPedido itemPedido) {
//		valorTotal += itemPedido.getValorUnitario() * itemPedido.getQuantidade();
		itens.add(itemPedido);
	}

	public double valorTotal() {
//		valorTotal += ItemPedido.getValorUnitario() * ItemPedido.getQuantidade();
//		return valorTotal;
		
		return valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		
	}

	public double desconto() {
		return desconto;
	}
	
//	minuto 12:20 2.3. Um passo de cada vez - baby steps

}
