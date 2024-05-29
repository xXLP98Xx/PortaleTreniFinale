package com.corso.carrozza.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.Beans;
import com.corso.treno.dao.RistoranteDAO;
import com.corso.treno.model.Ristorante;

public class RistoranteDAOTest {

	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		RistoranteDAO dao = factory.getBean("ristoranteDAO", RistoranteDAO.class);
		
		Ristorante bean = dao.find(7);
	    System.out.println(bean);

	}

}
