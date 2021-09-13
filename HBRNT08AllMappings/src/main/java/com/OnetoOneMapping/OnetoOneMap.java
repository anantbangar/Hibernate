package com.OnetoOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateOnetoOne.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question ques1=new Question();
		ques1.setQuesId(01);
		ques1.setQues("what is java");
		
		Question ques2=new Question();
		ques2.setQuesId(02);
		ques2.setQues("what is c++");
		
		Answer ans1=new Answer();
		ans1.setAnsId(100);
		ans1.setAns("java is secure programming lanuage");
		
		Answer ans2=new Answer();
		ans2.setAnsId(200);
		ans2.setAns("c++ is oop programming lanuage");
		
		ques1.setAns(ans1);
		ques2.setAns(ans2);
		
		
		ans1.setQues(ques1); 
		ans2.setQues(ques2);
		 
		
		System.out.println(ques1);
		System.out.println(ques2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(ques1);
		session.save(ques2);
		session.save(ans1);
		session.save(ans2);
		
		tx.commit();
		session.close();
		factory.close();
		
	}

}
