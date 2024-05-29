package com.corso.treno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "passeggeri")
public class Passeggeri extends Vagone{
	
	@Column(name="posti_totali")
	private int postiTotali;
	
	@Column(name="posti_occupati")
	private int postiOccupati;
	
	@Column(name="classe")
	private String classe;
	
	@Transient
	private String identificativo;
	
	
	public Passeggeri() {
		super();
		this.identificativo = "P" ;
	}

	

	public Passeggeri(int peso,double lunghezza, String tipologia, double prezzo, int postiTotali, int postiOccupati, String classe) {
		super(peso, -1, lunghezza, tipologia, prezzo);
		this.postiTotali = postiTotali;
		this.postiOccupati = postiOccupati;
		this.classe = classe;
		this.identificativo = "P";
	}



	public void controllaDisponiblità(int numPosti, int postiOccupati) {
		System.out.println("Nella carrozza rimasti" + (numPosti-postiOccupati) +  "!\n");

	}



	@Override
	public String getIdentificativo() {
		return this.identificativo;
	}

	@Override
	public int getPeso() {
		return peso;
	}



	
	@Override
	public String toString() {
		return "Passeggeri [postiTotali=" + postiTotali + ", postiOccupati=" + postiOccupati + ", classe=" + classe
				+ ", identificativo=" + identificativo + ", id_vagone=" + id_vagone + ", peso=" + peso + ", posizione="
				+ posizione + ", lunghezza=" + lunghezza + ", prezzo=" + prezzo + "]";
	}



	@Override
	public double getLunghezza() {
		return lunghezza ;
	}



}
