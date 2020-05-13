package com.dev.renanrramos.designpattern.model;

public class ItemDaNota {

	private String descricao;
	private double valor;
	
	public ItemDaNota(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "ItemDaNota [descricao=" + descricao + ", valor=" + valor + "]";
	}
	
}
