package com.corso.carrozza.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.Beans;
import com.corso.treno.dao.PasseggeriDAO;
import com.corso.treno.model.Passeggeri;

public class PasseggeriDAOTest {

	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		PasseggeriDAO dao = factory.getBean("passeggeriDAO", PasseggeriDAO.class);
		
		Passeggeri bean = dao.find(3);
	    System.out.println(bean);

	}

}
