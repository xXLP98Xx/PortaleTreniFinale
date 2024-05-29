package com.corso.builder;

import com.corso.treno.model.Vagone;

public class FRTrenoBuilder extends TrenoBuilder{
	@Override
	protected Vagone getMotrice() {
		return new FRMotrice();
	}

	@Override
	protected Vagone getPasseggeri() {
		return new FRPasseggeri();
	}

	@Override
	protected Vagone getRistorante() {
		return new FRRistorante();
	}

	@Override
	protected Vagone getCargo() {
		return new FRCargo();
	}
}
