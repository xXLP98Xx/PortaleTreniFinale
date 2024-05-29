package com.corso.treno.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.model.Cargo;
import com.corso.treno.model.Passeggeri;

public class PasseggeriDAOImpl extends BaseDAO implements PasseggeriDAO{
	@PersistenceContext
	EntityManager manager;

	@Override
	public Passeggeri find(int id) {
		
		Passeggeri c = manager.find(Passeggeri.class, id);
		return c;
	}
	
	

	@Override
	@Transactional
	public void add(Passeggeri c) {
		manager.persist(c);
	}
	
	
	
}
