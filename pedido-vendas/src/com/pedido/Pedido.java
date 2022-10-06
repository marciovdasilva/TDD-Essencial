package com.pedido;

import java.util.ArrayList;
import java.util.List;

import com.pedido.desconto.CalculadoraFaixaDesconto;

public class Pedido {
	
//	private double valorTotal = 0;
//	private double desconto = 0;
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	private CalculadoraFaixaDesconto calculadoraFaixaDesconto;

	public Pedido(CalculadoraFaixaDesconto calculadoraFaixaDesconto) {
		this.calculadoraFaixaDesconto = calculadoraFaixaDesconto;
	}

	private void validarQuantidadeItens(ItemPedido itemPedido) {
		if (itemPedido.getQuantidade() < 0)
			throw new QuantidadeItensInvalidaException();
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
//		valorTotal += itemPedido.getValorUnitario() * itemPedido.getQuantidade();
		validarQuantidadeItens(itemPedido);
		
		itens.add(itemPedido);
	}


//	public ResumoPedido resumo() {
//		double valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
//		double desconto = 0;
//		
//		if (valorTotal > 300.0 && valorTotal <= 800.0) {
//			desconto = valorTotal * 0.04;
//		}
//		else if (valorTotal > 800.0 && valorTotal <= 1000.0) {
//			desconto = valorTotal * 0.06;
//		}		
//		else if (valorTotal > 1000.0) {
//			desconto = valorTotal * 0.08;
//		}
//		
//		return new ResumoPedido(valorTotal, desconto);
//				
//	}

	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValorUnitario() * i.getQuantidade()).sum();
		double desconto = calculadoraFaixaDesconto.desconto(valorTotal);
		
		
		return new ResumoPedido(valorTotal, desconto);
				
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
