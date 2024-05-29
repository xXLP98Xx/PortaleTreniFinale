package com.corso.treno.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corso.treno.filter.TrenoFilter;
import com.corso.treno.model.Treno;

public class TrenoDAOImplTest {

	public static void main(String[] args) {
		//testTrenoFind();
		//testTrenoAdd();
		//testTrenoRemove();
		//testTrenoUpdate();
		//testTrenoDuplicate();
		//testTrenoShowAll();
		//testTrenoFindByCompagnia();
		//testTrenoFindByUtente();
		//testTrenoFindByFilter();
	}
	
	public static void testTrenoFind() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		Treno bean=dao.find(15);
		System.out.println(bean);
	}
	
	public static void testTrenoAdd() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		//Treno bean = new Treno(9,"TRENORD",15);
		//dao.add(bean);
		//System.out.println(bean);
	}
	
	public static void testTrenoRemove() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		dao.remove(11);
	}
	
	public static void testTrenoUpdate() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
//		Treno treno = new Treno(9,"TRENITALIA",20);
//		dao.update(15,treno);
	}
	
	public static void testTrenoDuplicate() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		dao.duplicate(14);
	}
	
	public static void testTrenoShowAll() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		System.out.println(dao.all().toString());
	}
	
	public static void testTrenoFindByCompagnia() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		System.out.println(dao.findByNameCompagnia("tReni").toString());
	}
	
	public static void testTrenoFindByUtente() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		System.out.println(dao.findByUtente(1).toString());
	}
	
	
	//TODO DA FINIRE
	public static void testTrenoFindByFilter() {
		BeanFactory factory = new AnnotationConfigApplicationContext(Beans.class);
		TrenoDAO dao=factory.getBean("trenoDAO",TrenoDAO.class);
		
		TrenoFilter tf = new TrenoFilter(45000,70000);
		System.out.println(dao.findByFilter(tf).toString());
	}
}
