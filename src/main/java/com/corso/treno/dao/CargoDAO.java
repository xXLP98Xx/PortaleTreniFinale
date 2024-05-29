package com.corso.treno.dao;

import com.corso.treno.model.Cargo;

public interface CargoDAO {
	
	public abstract Cargo find(int id);
	
	public abstract void add(Cargo c );

}