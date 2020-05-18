package com.dev.renanrramos.designpattern.interpreter;

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
}
