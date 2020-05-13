package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
