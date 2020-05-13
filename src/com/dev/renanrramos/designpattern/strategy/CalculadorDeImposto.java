package com.dev.renanrramos.designpattern.strategy;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class CalculadorDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
		double impostCalculado = impostoQualquer.calcula(orcamento);
		System.out.println(impostCalculado);
	}
	
}
