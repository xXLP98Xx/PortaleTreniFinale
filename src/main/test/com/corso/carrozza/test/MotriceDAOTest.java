package com.corso.carrozza.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.Beans;
import com.corso.treno.dao.MotriceDAO;
import com.corso.treno.model.Motrice;

public class MotriceDAOTest {

	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		MotriceDAO dao = factory.getBean("motriceDAO", MotriceDAO.class);
		
		Motrice bean = dao.find(1);
	    System.out.println(bean);
	}

}
