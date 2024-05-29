package com.corso.treno.dao;

import com.corso.treno.model.Ristorante;

public interface RistoranteDAO {
	public abstract Ristorante find(int id);
	public abstract void add(Ristorante c );
}
