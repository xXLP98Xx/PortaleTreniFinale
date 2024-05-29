package com.corso.carrozza.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.dao.*;
import com.corso.treno.model.Cargo;
public class CargoDAOTest {

	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		CargoDAO dao = factory.getBean("cargoDAO", CargoDAO.class);
		
		Cargo bean = dao.find(8);
	    System.out.println(bean);
	}
}