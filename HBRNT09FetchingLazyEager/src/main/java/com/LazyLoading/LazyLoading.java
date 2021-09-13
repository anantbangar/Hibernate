package com.LazyLoading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LazyLoading 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateLazy.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Question1 ques1=session.get(Question1.class,1);
		Question1 ques2=session.get(Question1.class,2);
				
		System.out.println(ques1.getQuesId());
		System.out.println(ques1.getQues());
		System.out.println(ques1.getAns().size());

		System.out.println(ques2.getQuesId());
		System.out.println(ques2.getQues());
		System.out.println(ques2.getAns().size());
		
		session.close();
		factory.close();
		
		
	}

}
