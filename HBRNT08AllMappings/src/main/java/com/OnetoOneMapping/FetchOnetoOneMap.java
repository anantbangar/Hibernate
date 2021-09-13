package com.OnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchOnetoOneMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateOnetoOne.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Question ques1=(Question)session.get(Question.class,01);
		Question ques2=(Question)session.get(Question.class,02);
		
		System.out.println(ques1);
		System.out.println(ques2);
		
		session.close();
		factory.close();
		
	}

}
