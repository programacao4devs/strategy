package com.programacao4devs.strategy.impressora.impl;

import com.programacao4devs.strategy.impressora.Impressora;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprime() {
		System.out.println("Imprimindo relatório com a impressora HP");
	}

}
