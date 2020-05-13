package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
//		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
//		d2.setProximo(d3);

		return d1.desconto(orcamento);
	}
}
