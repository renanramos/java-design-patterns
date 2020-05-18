package com.dev.renanrramos.designpattern.command;

public class ConcluiPedido implements Comando{

	private Pedido pedido;
	
	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;				
	}
	
	@Override
	public void executa() {
		System.out.println("Concluindo pedido do cliente: " + this.pedido.getCliente());
		this.pedido.finaliza();
	}

}
