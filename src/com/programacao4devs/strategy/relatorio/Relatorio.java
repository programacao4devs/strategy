package com.programacao4devs.strategy.relatorio;

import com.programacao4devs.strategy.impressora.Impressora;

public abstract class Relatorio {

	protected Impressora impressora;
	
	public abstract void geraRelatorio();
	
	public void imprime() {
		this.impressora.imprime();
	}
	
	public void setImpressora(Impressora impressora) {
		this.impressora = impressora;
	}
}
