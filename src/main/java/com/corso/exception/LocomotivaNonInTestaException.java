package com.corso.exception;

public class LocomotivaNonInTestaException extends LocomotivaException {


	private String sigla; 
		
	public LocomotivaNonInTestaException(String message, String sigla) {
		super(message);
		this.sigla = sigla; 
	}

	public String getSigla() {
		return sigla;
	}
	
	public String getSiglaSuggerita() {
		return "H" + sigla;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSuggerimento:" + getSiglaSuggerita();
	}


}
