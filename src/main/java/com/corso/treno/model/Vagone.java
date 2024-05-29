package com.corso.treno.model;

import java.sql.Date;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "vagone")
public abstract class Vagone {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id_vagone ;
	
	@Column(name="peso")
	protected int peso ;
	
	@Column(name="posizione",nullable=false)
	protected int posizione ;
	
	@Column(name="lunghezza")
	protected double lunghezza ;
	
	@Column(name="tipologia")
	protected String tipologia ;
	
	@Column(name="prezzo")
	protected double prezzo ;
	
	

	public Vagone() {
		super();
	}
	
	

	public Vagone(int peso, int posizione, double lunghezza, String tipoologia, double prezzo) {
		super();
		this.peso = peso;
		this.posizione = posizione;
		this.lunghezza = lunghezza;
		this.prezzo = prezzo;
	}



	public void eseguiManutenzione() {
		System.out.println("Manutenzione eseguita correttamente!\n");
	}
	
	
	


	public int getId_vagone() {
		return id_vagone;
	}

	public abstract String getIdentificativo(); 

	public void setId_vagone(int id_vagone) {
		this.id_vagone = id_vagone;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getPosizione() {
		return posizione;
	}



	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}



	public double getLunghezza() {
		return lunghezza;
	}



	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}


	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	@Override
	public String toString() {
		return "Vagone [id_carrozza=" + id_vagone + ", peso=" + peso + ", posizione=" + posizione + ", lunghezza="
				+ lunghezza  + ", prezzo=" + prezzo + "]";
	}


	
	
		
	

}
