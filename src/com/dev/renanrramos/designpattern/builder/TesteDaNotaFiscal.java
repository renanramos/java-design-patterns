package com.dev.renanrramos.designpattern.builder;

import com.dev.renanrramos.designpattern.model.ItemDaNota;
import com.dev.renanrramos.designpattern.model.NotaFiscal;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		ItemDaNota itemDaNota = new ItemDaNotaBuilder()
				.comDescricao("item 04")
				.comValor(100.0)
				.constroi();
		
		NotaFiscal nf = new NotaFiscalBuilder()
			.comEmpresa("Caelum Ensino e Invação")
			.comCnpj("cnpj")
			.com(new ItemDaNota(1, "item 01", 200.0))
			.com(new ItemDaNota(2, "item 02", 300.0))
			.com(new ItemDaNota(3, "item 03", 400.0))
			.com(itemDaNota)
			.comObservacao("observacoes")
			.dataAtual()
			.constroi();
		
		
		System.out.println(nf.toString());
		
	}
}
