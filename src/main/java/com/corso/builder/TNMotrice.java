package com.corso.builder;

import java.awt.Color;

import com.corso.treno.model.Motrice;

public class TNMotrice extends Motrice{
	
	public TNMotrice() {
		super(50,  27,  "TN", 200000 , 126);
	}

	@Override
	public String getIdentificativo() {
		return "H";
	}

}
