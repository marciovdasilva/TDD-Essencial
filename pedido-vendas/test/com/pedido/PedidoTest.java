package com.pedido;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {

	private Pedido pedido;
	
	@Before 
	public void setup() {
		pedido = new Pedido();
	}
	
	private void assertResumoPedido(double valorTotal, double desconto) {
		assertEquals(valorTotal, pedido.valorTotal(), 0.001);
		assertEquals(desconto, pedido.desconto(), 0.001);
	}
	
	@Test
	public void deveCriarUmPedido() throws Exception {
//		Pedido pedido = new Pedido();
	}
	
	@Test
	public void devePermitirAdicionarUmItemNoPedido() throws Exception {
//		Pedido pedido = new Pedido();
		pedido.adicionarItem(new itemPedido("Sabonete", 3.0, 10));
	}
	
	@Test
	public void deveCalcularValorTotalParaPedidoVazio() throws Exception {
		assertEquals(0.0, pedido.valorTotal(), 0.0001);
	}
	
	@Test
	public void deveCalcularValorTotalEDescontoParaPedidoVazio() throws Exception {
		assertResumoPedido(0.0, 0.0);
	}
	
	@Test
	public void deveCalcularResumoParaUmItemSemDesconto() throws Exception {
		pedido.adicionarItem(new itemPedido("Sabonete", 5.0, 5));
		assertResumoPedido(25.0, 0.0);
	}
	
	
	
}
