package com.corso.treno.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;


import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.model.Cargo;



public class CargoDAOImpl extends BaseDAO implements CargoDAO {
	@PersistenceContext
	EntityManager manager;

	@Override
	public Cargo find(int id) {
		
		Cargo c = manager.find(Cargo.class, id);
		return c;
	}
	
	

	@Override
	@Transactional
	public void add(Cargo c) {
		manager.persist(c);
	}
	
	
	

}

