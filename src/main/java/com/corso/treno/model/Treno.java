package com.corso.treno.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="treno")
public class Treno implements Bean{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	@Column(name="utente_id",nullable=false)
	private int utenteId ;
	
	@Column(name="compagnia",nullable=false)
	private String compagnia ;
	
	//one to many, cascade delete
	ArrayList<Vagone> listaVagoni;
	
	public Treno(int utenteID, ArrayList<Vagone> listaVagoni2) {
		this.listaVagoni = listaVagoni2;
		this.utenteId = utenteID;
		//this.compagnia = listaVagoni.get(0).tipologia;
	}
	
	public Treno() {
	}

	public Treno(int utenteId, String compagnia) {
		super();
		this.utenteId = utenteId;
		this.compagnia = compagnia;
	}
	
	@Override
	public String toString() {
		return "\nTreno [id=" + id + ", utenteId=" + utenteId + ", compagnia=" + compagnia + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUtenteId() {
		return utenteId;
	}

	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
	}

	public String getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(String compagnia) {
		this.compagnia = compagnia;
	}




}
