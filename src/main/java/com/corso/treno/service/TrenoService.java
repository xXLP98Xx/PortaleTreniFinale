package com.corso.treno.service;

import java.util.List;
import javax.transaction.Transactional;

import com.corso.treno.dao.TrenoDAO;
import com.corso.treno.filter.TrenoFilter;
import com.corso.treno.model.Treno;

@Transactional
public interface TrenoService {
	public Treno find(int id);
	public void add(Treno t);
	public void remove(int idTreno);
	public void update(int idTrenoOld, Treno trenoNew);
	public void inversion(Treno t); 
	public void duplicate(int idTreno);
	public List<Treno> findByFilter(TrenoFilter filter);
	public List<Treno> all();
	public List<Treno> findByNameCompagnia(String name);
	public List<Treno> findByUtente(int idUtente);
	/*togliere set*/
	public void setTrenoService(TrenoDAO trenoDao);
}
