package com.OnetoManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OnetoOneMapping.Answer;
import com.OnetoOneMapping.Question;

public class OnetoManyMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateOnetoMany.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question1 ques1=new Question1();
		ques1.setQuesId(01);
		ques1.setQues("what is java");
		
		Question1 ques2=new Question1();
		ques2.setQuesId(02);
		ques2.setQues("what is C");
		
		Answer1 ans1=new Answer1();
		ans1.setAnsId(100);
		ans1.setAns("java is secure programming lanuage");
		ans1.setQues(ques1);
		
		Answer1 ans2=new Answer1();
		ans2.setAnsId(200);
		ans2.setAns("java has so many frameworks");
		ans2.setQues(ques1);
		
		Answer1 ans3=new Answer1();
		ans3.setAnsId(300);
		ans3.setAns("C is mother programming lanuage");
		ans3.setQues(ques2);
		
		Answer1 ans4=new Answer1();
		ans4.setAnsId(400);
		ans4.setAns("It is basic of all lanuage");
		ans4.setQues(ques2);
		
		Answer1 ans5=new Answer1();
		ans5.setAnsId(500);
		ans5.setAns("You should learn C first");
		ans5.setQues(ques2);
		
		List<Answer1> list1=new ArrayList<Answer1>();
		list1.add(ans1);
		list1.add(ans2);

		List<Answer1> list2=new ArrayList<Answer1>();
		list2.add(ans3);
		list2.add(ans4);
		list2.add(ans5);
		
		ques1.setAns(list1);		
		ques2.setAns(list2);		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(ques1);
		session.save(ques2);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		session.save(ans4);
		session.save(ans5);
		
		tx.commit();
		session.close();
		factory.close();
			
	}

}
