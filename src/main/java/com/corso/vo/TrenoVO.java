package com.corso.vo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class TrenoVO {
	@NotNull
	String compagnia;
	@NotNull
	int utenteId;

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}

	public int getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
	}
		

}
