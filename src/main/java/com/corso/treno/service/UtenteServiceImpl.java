package com.corso.treno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.corso.treno.dao.UtenteDAO;
import com.corso.treno.model.Utente;


public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private UtenteDAO dao;
	
	@Override
	public Utente findById(int id) {
		return dao.find(id);
	}

	@Override
	public Utente findByUsername(String username) {
		return dao.find(username);
	}

	@Override
	public void add(Utente u) {
		dao.add(u);
	}

//	@Override
//	public void setUtenteService(UtenteDAO dao) {
//		this.dao = dao;
//	}
	

}
