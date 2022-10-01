package com.pedido;

import com.pedido.desconto.CalculadoraDescontoPrimeiraFaixa;
import com.pedido.desconto.CalculadoraDescontoSegundaFaixa;
import com.pedido.desconto.CalculadoraDescontoTerceiraFaixa;
import com.pedido.desconto.CalculadoraFaixaDesconto;
import com.pedido.desconto.SemDesconto;

public class PedidoBuilder {
	private Pedido instancia;
	
	public PedidoBuilder() {
		CalculadoraFaixaDesconto calculadoraFaixaDesconto =
				new CalculadoraDescontoTerceiraFaixa(
						new CalculadoraDescontoSegundaFaixa(
								new CalculadoraDescontoPrimeiraFaixa(
										new SemDesconto(null))));
			
		instancia = new Pedido(calculadoraFaixaDesconto);
	}
	
	public PedidoBuilder comItem(double valorUnitario, int quantidade) {
		instancia.adicionarItem(new ItemPedido("Gerado", valorUnitario, quantidade));
		return this;
	}
	
	public Pedido construir() {
		return instancia;
	}
	
	public Pedido valorTotal() {
		return instancia;
	}
	
	
	
}
