package com.dev.renanrramos.designpattern.observer;

import com.dev.renanrramos.designpattern.builder.NotaFiscalBuilder;
import com.dev.renanrramos.designpattern.model.ItemDaNota;
import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class TesteAcoes {
	
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new ImprimeNotaFiscal());
		builder.adicionaAcao(new EnviadorDeSMS());
		
		NotaFiscal notaFiscal = builder.comCnpj("asdadad")
				.comObservacao("asdasd")
				.com(new ItemDaNota("item 01", 200.0))
				.dataAtual()
				.comEmpresa("Empresa")
				.constroi();
		
		System.out.println(notaFiscal.toString());
	}
}
