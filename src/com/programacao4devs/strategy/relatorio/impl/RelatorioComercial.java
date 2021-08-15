package com.programacao4devs.strategy.relatorio.impl;

import com.programacao4devs.strategy.impressora.impl.ImpressoraHP;
import com.programacao4devs.strategy.relatorio.Relatorio;

public class RelatorioComercial extends Relatorio {

	public RelatorioComercial() {
		impressora = new ImpressoraHP();
	}
	
	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatório comercial ...");
	}

}
