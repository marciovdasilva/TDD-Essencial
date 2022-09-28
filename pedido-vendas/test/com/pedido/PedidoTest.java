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
		ResumoPedido resumoPedido = pedido.resumo();
		
		assertEquals(valorTotal, resumoPedido.getValorTotal(), 0.001);
		assertEquals(desconto, resumoPedido.getDesconto(), 0.001);
	}
	
	@Test
	public void deveCriarUmPedido() throws Exception {
//		Pedido pedido = new Pedido();
	}
	
	@Test
	public void devePermitirAdicionarUmItemNoPedido() throws Exception {
//		Pedido pedido = new Pedido();
		pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 10));
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
		pedido.adicionarItem(new ItemPedido("Sabonete", 5.0, 5));
		assertResumoPedido(25.0, 0.0);
	}
	
	
	@Test
	public void deveCaltularresumoParaDoisItensSemDesconto() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 3));
		pedido.adicionarItem(new ItemPedido("Pasta dental", 7.0, 3));
		
		assertResumoPedido(30.0, 0.0);
	}
	
	@Test
	public void deveAplicarDescontoPrimeiraFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Creme", 20.0, 20));
		
		assertResumoPedido(400.0, 16.0);
	}
	
	@Test
	public void deveAplicarDescontoSegundaFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Shampoo", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Escova", 15.0, 30));
		
		assertResumoPedido(900.0, 54.0);
	}
	
	@Test
	public void deveAplicarDescontoTerceiraFaixa() throws Exception {
		pedido.adicionarItem(new ItemPedido("Creme", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Óleo", 15.0, 30));
		pedido.adicionarItem(new ItemPedido("Sabonete", 10.0, 30));
		
		assertResumoPedido(1200.0, 96.0);
	}
	
}
