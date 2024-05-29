package com.corso.treno.dao;

import com.corso.treno.model.Passeggeri;

public interface PasseggeriDAO {
	
	public abstract Passeggeri find(int id);
	
	public abstract void add(Passeggeri c );

}