package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernateOnetoMany.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        Question1 q1=new Question1();
        q1.setQuesId(9);
        q1.setQues("what is cascading");
        
        Answer1 ans1=new Answer1(800,"it is imp in hibernate",q1);
        Answer1 ans2=new Answer1(900,"you must learn it",q1);
        
        List<Answer1> list=new ArrayList<Answer1>();
        list.add(ans1);
        list.add(ans2);
        
        q1.setAns(list);
        
        Transaction tx = session.beginTransaction();
        
        session.save(q1);
        
        tx.commit();
        session.close();
        factory.close();
    }
}
