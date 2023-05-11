package com.firstprogm;

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
    	
    	Student st=new Student();
    	st.setId(993);
    	st.setName("anant");
    	st.setCity("mumbai");
    	System.out.println(st);
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(st);
    	tx.commit();
    	session.close();
        
    }
}	
