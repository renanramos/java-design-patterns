package com.dev.renanrramos.designpattern.chainOfResponsibility;

import com.dev.renanrramos.designpattern.model.Item;
import com.dev.renanrramos.designpattern.model.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lapis", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
