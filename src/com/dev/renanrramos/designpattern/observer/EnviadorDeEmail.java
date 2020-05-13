package com.dev.renanrramos.designpattern.observer;

import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Envia por email: " + notaFiscal.toString());
	}
}
