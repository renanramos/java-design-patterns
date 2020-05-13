package com.dev.renanrramos.designpattern.model;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	private String observacoes;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmissao, double valorBruto, double impostos,
			List<ItemDaNota> itens, String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", dataEmissao=" + dataEmissao.getTime()
				+ ", valorBruto=" + valorBruto + ", impostos=" + impostos + ", itens=" + itens + ", observacoes="
				+ observacoes + "]";
	}
	
}
