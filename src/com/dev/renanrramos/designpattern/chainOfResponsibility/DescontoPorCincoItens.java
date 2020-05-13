package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class DescontoPorCincoItens implements Desconto{

	private Desconto proximoDesconto;
	
	public double desconto(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximoDesconto.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
}
