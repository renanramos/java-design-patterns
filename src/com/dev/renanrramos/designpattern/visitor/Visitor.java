package com.dev.renanrramos.designpattern.visitor;

import com.dev.renanrramos.designpattern.interpreter.Numero;
import com.dev.renanrramos.designpattern.interpreter.Soma;
import com.dev.renanrramos.designpattern.interpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubstracao(Subtracao subtracao);

	void visitaNumero(Numero numero);

}