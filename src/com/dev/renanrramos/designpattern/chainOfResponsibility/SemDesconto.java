package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {	
	}

}
