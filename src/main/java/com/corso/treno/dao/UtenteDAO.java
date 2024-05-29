package com.corso.treno.dao;

import java.sql.Date;

import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.model.Utente;

@Transactional
public interface UtenteDAO {

	public Utente find(int id);
	public Utente find(String username);
	public void add(Utente u);

}
