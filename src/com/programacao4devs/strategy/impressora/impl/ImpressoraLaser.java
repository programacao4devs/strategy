package com.programacao4devs.strategy.impressora.impl;

import com.programacao4devs.strategy.impressora.Impressora;

public class ImpressoraLaser implements Impressora {

	@Override
	public void imprime() {
		System.out.println("Imprimindo relatório com a impressora Laser");
	}

}
