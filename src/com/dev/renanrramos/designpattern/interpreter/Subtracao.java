package com.dev.renanrramos.designpattern.interpreter;

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
}
