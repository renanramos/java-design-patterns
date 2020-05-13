package com.dev.renanrramos.designpattern.observer;

import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class EnviadorDeSMS implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviar SMS: " + notaFiscal.toString());
	}
}
