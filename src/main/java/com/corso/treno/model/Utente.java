package com.corso.treno.model;

import java.sql.Date;


import java.time.LocalDate;


import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;



@Entity(name="utente")
public class Utente implements Bean{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	@Column(name="username",nullable=false)
	private String username ;
	
	@Column(name="password",nullable=false)
	private String password ;
	
	@Column(name="nome",nullable=false)
	private String nome ;
	
	@Column(name="cognome",nullable=false)
	private String cognome ;
	
	
	@Column(name="data_nascita")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataDiNascita ;
	
	public Utente() {
		
	}
	
	public Utente(String username, String password, String nome, String cognome, LocalDate dataDiNascita) {
		super();
		this.username = username;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
	}

	@Override
	public String toString() {
		return nome;
	}

	
	//getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	
	//setter
	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	

}

	


	

	



	
