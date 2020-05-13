package com.dev.renanrramos.designpattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.dev.renanrramos.designpattern.model.ItemDaNota;
import com.dev.renanrramos.designpattern.model.NotaFiscal;
import com.dev.renanrramos.designpattern.observer.AcaoAposGerarNotaFiscal;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double imposto;
	private String observacao;
	private Calendar data;
	
	private List<AcaoAposGerarNotaFiscal> todasAcoesASeremExecutada;
	
	public NotaFiscalBuilder() {
		this.todasAcoesASeremExecutada = new ArrayList<AcaoAposGerarNotaFiscal>();
	}
	
	public NotaFiscalBuilder comEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public void adicionaAcao(AcaoAposGerarNotaFiscal acao) {
		this.todasAcoesASeremExecutada.add(acao);
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		this.todosItens.add(item);
		this.valorBruto += item.getValor();
		this.imposto += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder dataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.cnpj, this.data, this.valorBruto, this.imposto, this.todosItens, this.observacao);
		todasAcoesASeremExecutada.forEach(acao -> acao.executa(notaFiscal));
		return notaFiscal;
	}

}
