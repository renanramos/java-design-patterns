package com.dev.renanrramos.designpattern.observer;

import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Savar: " + notaFiscal.toString());
	}
}
