package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 
{
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp3 e1=new Emp3(103,"anant","thane","255665");
		Emp3 e2=new Emp3(104,"ram","thane","255665");
		Emp3 e3=new Emp3(105,"shailoo","thane","255665");
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
