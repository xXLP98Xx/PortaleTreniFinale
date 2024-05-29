package com.corso.treno.dao;

import com.corso.treno.model.Cargo;
import com.corso.treno.model.Motrice;

public interface MotriceDAO {
	public abstract Motrice find(int id);
	public abstract void add(Motrice c );
}
