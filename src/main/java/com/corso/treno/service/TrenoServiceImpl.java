package com.corso.treno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.corso.treno.dao.TrenoDAO;
import com.corso.treno.dao.UtenteDAO;
import com.corso.treno.filter.TrenoFilter;
import com.corso.treno.model.Treno;

@Component
public class TrenoServiceImpl implements TrenoService {

	@Autowired
	private TrenoDAO dao = null ;
	
	@Override
	public Treno find(int id) {
		return dao.find(id);
	}

	@Override
	public void add(Treno t) {
		dao.add(t);
	}

	@Override
	public void remove(int idTreno) {
		dao.remove(idTreno);
	}

	@Override
	public void update(int idTrenoOld, Treno trenoNew) {
		dao.update(idTrenoOld, trenoNew);
	}

	@Override
	public void inversion(Treno t) {
		dao.inversion(t);
	}

	@Override
	public void duplicate(int idTreno) {
		dao.duplicate(idTreno);
	}

	@Override
	public List<Treno> findByFilter(TrenoFilter filter) {
		return dao.findByFilter(filter);
	}

	@Override
	public List<Treno> all() {
		return dao.all();
	}

	@Override
	public List<Treno> findByNameCompagnia(String name) {
		return dao.findByNameCompagnia(name);
	}

	@Override
	public List<Treno> findByUtente(int idUtente) {
		return dao.findByUtente(idUtente);
	}

	@Override
	public void setTrenoService(TrenoDAO trenoDao) {
		this.dao = trenoDao;
	}

}
