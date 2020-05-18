package com.dev.renanrramos.designpattern.builder;

import com.dev.renanrramos.designpattern.model.ItemDaNota;

public class ItemDaNotaBuilder {

	private Integer id;
	private String descricao;
	private double valor;

	public ItemDaNotaBuilder comId(Integer id) {
		this.id = id;
		return this;
	}
	
	public ItemDaNotaBuilder comDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}
		
	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota constroi() {
		return new ItemDaNota(id, descricao, valor);
	}
}
