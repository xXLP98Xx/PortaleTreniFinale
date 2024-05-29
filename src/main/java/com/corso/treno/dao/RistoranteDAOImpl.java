package com.corso.treno.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.corso.treno.model.Ristorante;

public class RistoranteDAOImpl extends BaseDAO implements RistoranteDAO{
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Ristorante find(int id) {
		Ristorante c = manager.find(Ristorante.class, id);
		return c;
	}

	@Override
	@Transactional
	public void add(Ristorante c) {
		manager.persist(c);		
	}
	
}
