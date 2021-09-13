package com.objectstates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ObjectStateDemo 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=
				new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Transient State : till object not save by session
		School scl1=new School();
		scl1.setId(101);
		scl1.setName("Brahman Vidyalay");
		scl1.setCity("Thane");
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		//Persistent State : after object saved by session
		session.save(scl1);
		
		//before commit, you can change object parameters
		scl1.setName("Samarth Vidyalay"); 
		
		tx.commit();
		session.close();
		
		//Detached State : after session closed
		scl1.setName("Kalawa High School");
		System.out.println(scl1);
		
		factory.close();
	}

}
