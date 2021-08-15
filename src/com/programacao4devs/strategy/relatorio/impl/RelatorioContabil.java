package com.programacao4devs.strategy.relatorio.impl;

import com.programacao4devs.strategy.impressora.impl.ImpressoraLaser;
import com.programacao4devs.strategy.relatorio.Relatorio;

public class RelatorioContabil extends Relatorio {

	
	public RelatorioContabil() {
		impressora = new ImpressoraLaser();
	}
	
	@Override
	public void geraRelatorio() {
		System.out.println("Gerando relatório de contabilidade ...");
	}

}
