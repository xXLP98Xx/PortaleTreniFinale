package com.corso.treno.dao;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.Beans;
import com.corso.treno.dao.UtenteDAO;
import com.corso.treno.model.Utente;

public class UserDAOImplTest {

	public static void main(String[] args) {
		
		//testFindUtente();
		testAddUtente();
	}

	public static void testFindUtente() {

		   BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		   UtenteDAO dao = factory.getBean("utenteDAO", UtenteDAO.class); 

		   Utente bean = dao.find("pippo1");
//		   dao.add(u);

		   System.out.println(bean);
	}
	
	public static void testAddUtente() {
		   
		   BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		   UtenteDAO dao = factory.getBean("utenteDAO", UtenteDAO.class); 
		   LocalDate data =  LocalDate.of(1985, 1, 25);

		   Utente u = new Utente("Sergio16","forzaJuve","Sergio","Verdi",data);
		   dao.add(u);
		   System.out.println(u);
	}
	
	
	
}
