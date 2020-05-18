package com.dev.renanrramos.designpattern.interpreter;

import com.dev.renanrramos.designpattern.visitor.Visitor;

public interface Expressao {

	int avalia();
	void aceita(Visitor impressora);
}
