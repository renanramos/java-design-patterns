package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;
	
	public double desconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		return proximoDesconto.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		// para evitar a implementação de outra classe sem valor como final da corrente
		// basta setar o proximoDesconto como null
		this.proximoDesconto = null;//proximoDesconto;
	}
}
