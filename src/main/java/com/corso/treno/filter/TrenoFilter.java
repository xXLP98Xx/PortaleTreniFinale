package com.corso.treno.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;



public class TrenoFilter {


	Integer id;                    // and id=?  
	private String siglaContains = null;   // and nome like '%?'
	private Integer prezzoMin;     // and prezzo between (?,?) oppure  and prezzo >=? and prezzo <= ? 
	private Integer prezzoMax;
	private Integer pesoMin;     // and prezzo between (?,?) oppure  and prezzo >=? and prezzo <= ? 
	private Integer pesoMax;
	private Integer lunghezzaMin;     // and prezzo between (?,?) oppure  and prezzo >=? and prezzo <= ? 
	private Integer lunghezzaMax;
	
	
	
	
	public TrenoFilter(Integer id, String siglaContains, Integer prezzoMin, Integer prezzoMax, Integer pesoMin,
			Integer pesoMax, Integer lunghezzaMin, Integer lunghezzaMax) {
		super();
		this.id = id;
		this.siglaContains = siglaContains;
		this.prezzoMin = prezzoMin;
		this.prezzoMax = prezzoMax;
		this.pesoMin = pesoMin;
		this.pesoMax = pesoMax;
		this.lunghezzaMin = lunghezzaMin;
		this.lunghezzaMax = lunghezzaMax;
	}
	
	
	public TrenoFilter(Integer prezzoMin, Integer prezzoMax) {
		super();
		this.prezzoMin = prezzoMin;
		this.prezzoMax = prezzoMax;
	}

	public Integer getPesoMin() {
		return pesoMin;
	}

	public void setPesoMin(Integer pesoMin) {
		this.pesoMin = pesoMin;
	}

	public Integer getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(Integer pesoMax) {
		this.pesoMax = pesoMax;
	}

	public Integer getLunghezzaMin() {
		return lunghezzaMin;
	}

	public void setLunghezzaMin(Integer lunghezzaMin) {
		this.lunghezzaMin = lunghezzaMin;
	}

	public Integer getLunghezzaMax() {
		return lunghezzaMax;
	}

	public void setLunghezzaMax(Integer lunghezzaMax) {
		this.lunghezzaMax = lunghezzaMax;
	}


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getPrezzoMin() {
		return prezzoMin;
	}

	public void setPrezzoMin(int prezzoMin) {
		this.prezzoMin = prezzoMin;
	}

	public Integer getPrezzoMax() {
		return prezzoMax;
	}

	public void setPrezzoMax(int prezzoMax) {
		this.prezzoMax = prezzoMax;
	}



}
