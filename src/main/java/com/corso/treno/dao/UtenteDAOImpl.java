package com.corso.treno.dao;

import java.sql.Date;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.dao.*;
import com.corso.treno.model.Utente;



public class UtenteDAOImpl  extends BaseDAO implements UtenteDAO {
	@PersistenceContext
	EntityManager manager;

	@Override
	public Utente find(int id) {
		
		Utente p = manager.find(Utente.class, id);	 // in hibernate  get / load 
		return p;
	}

	@Override
	public Utente find(String username) {
		Query q = manager.createQuery("from utente where username like :username", Utente.class);
		q.setParameter("username", username);
		@SuppressWarnings("unchecked")
		Utente u =  (Utente) q.getSingleResult();
		return u;
	}

	@Override
	@Transactional
	public void add(Utente u) {
		manager.persist(u);
	}
	

}
