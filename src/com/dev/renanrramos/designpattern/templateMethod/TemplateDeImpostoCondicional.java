package com.dev.renanrramos.designpattern.templateMethod;

import com.dev.renanrramos.designpattern.model.Orcamento;
import com.dev.renanrramos.designpattern.strategy.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
		return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
	}

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
	
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
