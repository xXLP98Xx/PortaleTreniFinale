package com.corso.treno.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.Beans;
import com.corso.treno.model.Utente;

import net.bytebuddy.asm.Advice.This;

public class UtenteServiceImplTest {
	
	@Autowired
	UtenteService service = null ;		

	public static void main(String[] args) {


		testTransaction("pippo1");
//		Utente service = UtenteService
		
	}
	
	
	public static void testTransaction(String username){
			BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
			UtenteService service = factory.getBean("utenteService", UtenteService.class) ;
			Utente u = service.findByUsername(username);
			System.out.println("Utente: " + u);
//			
//			try {
//				service.archivia(id);  //Transazionale
//			
//			} catch (Exception e) {
//				
//				System.out.println(" Purtroppo si � verificata una eccezione: fallita archiviazione per categoria id=" + id );
//				e.printStackTrace();
//			}
	}

}
