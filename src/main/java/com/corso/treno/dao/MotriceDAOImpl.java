package com.corso.treno.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.corso.treno.model.Motrice;

public class MotriceDAOImpl extends BaseDAO implements MotriceDAO{
	@PersistenceContext
	EntityManager manager;

	@Override
	public Motrice find(int id) {
		Motrice c = manager.find(Motrice.class, id);
		return c;
	}

	@Override
	@Transactional
	public void add(Motrice c) {
		manager.persist(c);		
	}

}
