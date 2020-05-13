package com.dev.renanrramos.designpattern.observer;

import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class ImprimeNotaFiscal implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Imprimir: " + notaFiscal.toString());
	}
}
