package com.embedding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student1 st1=new Student1();
    	st1.setId(111);
    	st1.setName("anant");
    	
    	Student1 st2=new Student1();
    	st2.setId(112);
    	st2.setName("shailoo");
    	
    	Certificate certi1=new Certificate("c","3 months");
    	Certificate certi2=new Certificate("python","4 months");
    	
    	st1.setCerti(certi1);
    	st2.setCerti(certi2);
    	
    	System.out.println(st1);
    	System.out.println(st2);
    	    			
		Session session=factory.openSession(); 
		Transaction tx=session.beginTransaction();
		session.save(st1);
		session.save(st2);
		  
		tx.commit(); 
		session.close(); 
		factory.close();
		 
    }
}
