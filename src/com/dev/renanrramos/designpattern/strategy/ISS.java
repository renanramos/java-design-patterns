package com.dev.renanrramos.designpattern.strategy;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class ISS extends Imposto{

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
