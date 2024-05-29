package com.corso.treno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ristorante")
public class Ristorante extends Vagone implements Bean{
	
	@Column(name="pasti_erogabili")
	private int numPastiErogabili;
	
	@Column(name="num_prenotati")
	private int numPrenotati;
	
	@Transient
	private String identificativo;


	public Ristorante() {
		super();
		this.identificativo = "R" ;
	}


	
	
	public Ristorante(int peso, double lunghezza, String tipologia, double prezzo,int numPastiErogabili, int numPrenotati) {
	    super(peso, -1, lunghezza, tipologia, prezzo);
		this.numPastiErogabili = numPastiErogabili;
		this.numPrenotati = numPrenotati;
		this.identificativo = "R";
	}




	

	public int getNumPastiErogabili() {
		return numPastiErogabili;
	}




	public void setNumPastiErogabili(int numPastiErogabili) {
		this.numPastiErogabili = numPastiErogabili;
	}




	public int getNumPrenotati() {
		return numPrenotati;
	}




	public void setNumPrenotati(int numPrenotati) {
		this.numPrenotati = numPrenotati;
	}




	public String getIdentificativo() {
		return identificativo;
	}




	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}




	@Override
	public String toString() {
		return "Ristorante [numPastiErogabili=" + numPastiErogabili + ", numPrenotati=" + numPrenotati
				+ ", identificativo=" + identificativo + ", id_vagone=" + id_vagone + ", peso=" + peso + ", posizione="
				+ posizione + ", lunghezza=" + lunghezza + ", tipologia=" + tipologia + ", prezzo=" + prezzo + "]";
	}








	
	


}
