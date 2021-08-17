package com.programacao4devs.strategy;

import com.programacao4devs.strategy.impressora.impl.ImpressoraHP;
import com.programacao4devs.strategy.relatorio.Relatorio;
import com.programacao4devs.strategy.relatorio.impl.RelatorioContabil;

public class SimuladorRelatorio {

	public static void main(String[] args) {
		Relatorio relatorio = new RelatorioContabil();
		relatorio.geraRelatorio();
		relatorio.imprime();
		
		System.out.println();
		System.out.println("Mudando impressora em tempo de execução ...");
		relatorio.setImpressora(new ImpressoraHP());
		System.out.println();
		
		System.out.println("Relatório utilizando outra impressora:");
		relatorio.imprime();
	}

}
