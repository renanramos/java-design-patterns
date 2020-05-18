package com.dev.renanrramos.designpattern.interpreter;

import com.dev.renanrramos.designpattern.visitor.Visitor;

public class Subtracao implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int valorDaEsquerda = esquerda.avalia();
		int valorDaDireita = direita.avalia();
		return valorDaEsquerda - valorDaDireita;
	}

	public Expressao getDireita() {
		return direita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSubstracao(this);
	}
	
}
