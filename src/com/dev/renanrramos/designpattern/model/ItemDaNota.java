package com.dev.renanrramos.designpattern.model;

public class ItemDaNota {

	private Integer id;
	private String descricao;
	private double valor;
	
	public ItemDaNota(Integer id, String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "ItemDaNota [id=" + id + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	
}
