package com.webapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistration 
{
	public static int register(User u)
	{
		int i=0;
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		i=(Integer)session.save(u);
		
		tx.commit();
		session.close();
		factory.close();
		
		return i;
			
	}

}
