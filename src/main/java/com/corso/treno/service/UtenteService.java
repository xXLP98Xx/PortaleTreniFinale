package com.corso.treno.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.corso.treno.dao.UtenteDAO;
import com.corso.treno.model.Utente;


@Transactional
@Service
public interface UtenteService {
	
	public Utente findById(int id);
	public Utente findByUsername(String username);
	public void add(Utente u);
	//public void setUtenteService(UtenteDAO dao);
}
