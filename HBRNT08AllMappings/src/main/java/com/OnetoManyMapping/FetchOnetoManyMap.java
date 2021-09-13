package com.OnetoManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.OnetoOneMapping.Question;

public class FetchOnetoManyMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateOnetoMany.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Question1 ques1=(Question1)session.get(Question1.class,01);
		Question1 ques2=(Question1)session.get(Question1.class,02);
		
		System.out.println("Question id= "+ques1.getQuesId());
		System.out.println("Question is= "+ques1.getQues());
		for(Answer1 ans1 : ques1.getAns())
		{
			System.out.println("Answer id= "+ans1.getAnsId());
			System.out.println("Answer is = "+ans1.getAns());
			
		}
		

		System.out.println("Question id= "+ques2.getQuesId());
		System.out.println("Question is= "+ques2.getQues());
		for(Answer1 ans2 : ques2.getAns())
		{
			System.out.println("Answer id= "+ans2.getAnsId());
			System.out.println("Answer is = "+ans2.getAns());
			
		}
		
		session.close();
		factory.close();
		
	}
}
