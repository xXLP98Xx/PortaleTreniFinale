package com.corso.builder;

import java.awt.Color;

import com.corso.treno.model.Passeggeri;

public class TNPasseggeri extends Passeggeri{
	
	public TNPasseggeri() {
		super(20, 25,"TN" , 54000,  250, 0 , "A" );
	}

	@Override
	public String getIdentificativo() {
		return "P";
	}
}
