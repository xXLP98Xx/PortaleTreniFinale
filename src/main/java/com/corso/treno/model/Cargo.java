package com.corso.treno.model;

import javax.persistence.*;


@Entity
@Table(name = "cargo")
public class Cargo extends Vagone implements Bean{
	
	
	@Column(name="capacità_peso")
	private int capacitaPeso ;
	
	@Column(name="peso_trasportato",nullable=false)
	private int pesoTrasportato ;
	
	@Transient
	private String identificativo;
	
	
	
	

	public Cargo() {
		super();
		this.identificativo = "C" ;

	}
	
	


	public Cargo(int peso, double lunghezza, String tipologia, double prezzo, int capacitaPeso, int pesoTrasportato) {
	    super(peso, -1, lunghezza, tipologia, prezzo);
	    this.capacitaPeso = capacitaPeso;
	    this.pesoTrasportato = pesoTrasportato;
	    this.identificativo = "C";
	}





	public void controllaCapacita(double capacitaDiCarico, double pesoCarico) {
		System.out.println("Nella carrozza rimasti" + (capacitaDiCarico-pesoCarico) +  "!\n");

	}

		

	


	







	@Override
	public String toString() {
		return "Cargo [capacitaPeso=" + capacitaPeso + ", pesoTrasportato=" + pesoTrasportato + ", identificativo="
				+ identificativo + ", id_carrozza=" + id_vagone + ", peso=" + peso + ", posizione=" + posizione
				+ ", lunghezza=" + lunghezza + ", prezzo=" + prezzo + "]";
	}




	public int getCapacitaPeso() {
		return capacitaPeso;
	}


	public int getPesoTrasportato() {
		return pesoTrasportato;
	}


	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getLunghezza() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String getIdentificativo() {
		return identificativo;
	}


	



}