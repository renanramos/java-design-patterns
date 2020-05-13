package com.dev.renanrramos.designpattern.state;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento{

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos em aprova��o n�o podem ir direto para finalizado!");
	}
}
