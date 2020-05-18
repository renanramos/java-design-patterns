package com.dev.renanrramos.designpattern.interpreter;

import com.dev.renanrramos.designpattern.visitor.Visitor;

public class Soma implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEquerda + valorDaDireita;
	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
	}
	
	
}
