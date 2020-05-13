package com.dev.renanrramos.designpattern.templateMethod;

import com.dev.renanrramos.designpattern.model.Orcamento;
import com.dev.renanrramos.designpattern.strategy.ICMS;
import com.dev.renanrramos.designpattern.strategy.ISS;
import com.dev.renanrramos.designpattern.strategy.Imposto;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}
}
