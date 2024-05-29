package com.corso.builder;

import com.corso.treno.model.Cargo;
import com.corso.treno.model.Motrice;
import com.corso.treno.model.Passeggeri;
import com.corso.treno.model.Ristorante;

public class TNTrenoBuilder extends TrenoBuilder{

	@Override
	protected Motrice getMotrice() {
		return new TNMotrice();
	}

	@Override
	protected Passeggeri getPasseggeri() {
		return new TNPasseggeri();
	}

	@Override
	protected Ristorante getRistorante() {
		return new TNRistorante();
	}

	@Override
	protected Cargo getCargo() {
		return new TNCargo();
	}
	
}
