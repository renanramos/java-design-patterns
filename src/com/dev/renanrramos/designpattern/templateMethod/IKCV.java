package com.dev.renanrramos.designpattern.templateMethod;

import com.dev.renanrramos.designpattern.model.Item;
import com.dev.renanrramos.designpattern.model.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

	private boolean temItemMaiorQueCemReaisNo(Orcamento orcamento) {
		for (Item item: orcamento.getItens()) {	
			if (item.getValor() > 100) return true;
		}		
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQueCemReaisNo(orcamento);
	}
}
