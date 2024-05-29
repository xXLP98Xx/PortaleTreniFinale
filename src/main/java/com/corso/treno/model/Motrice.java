package com.corso.treno.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "motrice")
public class Motrice extends Vagone implements Bean{
	 
	@Column(name="peso_trainabile")
	protected double pesoTrainabile;
	
	@Transient
	private String identificativo;

	
	public Motrice() {
		super();
		this.identificativo = "H" ;

	}
	
	


	public Motrice(int peso, double lunghezza, String tipologia, double prezzo, double pesoTrainabile) {
	    super(peso, -1, lunghezza, tipologia, prezzo);
		this.pesoTrainabile = pesoTrainabile;
		this.identificativo = "H" ;
	}




	@Override
	public String toString() {
		return "Motrice [pesoTrainabile=" + pesoTrainabile + ", identificativo=" + identificativo + ", id_vagone="
				+ id_vagone + ", peso=" + peso + ", posizione=" + posizione + ", lunghezza=" + lunghezza + ", prezzo="
				+ prezzo + "]";
	}




	public String getIdentificativo() {
		return this.identificativo;
	}

	public double getPesoTrainabile() {
		return pesoTrainabile;
	}

	




}
