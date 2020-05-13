package com.dev.renanrramos.designpattern.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dev.renanrramos.designpattern.state.EmAprovacao;
import com.dev.renanrramos.designpattern.state.EstadoDeUmOrcamento;

public class Orcamento {

	public double valor;
	private final List<Item> itens;

	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();		
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finalizado() {
		estadoAtual.finaliza(this);
	}
}
