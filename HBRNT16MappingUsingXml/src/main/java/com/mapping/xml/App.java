package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
       
       Person p1=new Person(109,"anant","Mumbai","256412");
       Person p2=new Person(110,"shailoo","Thane","24552262");
       Person p3=new Person(111,"pawan","Nashik","125462");
       
       Transaction tx = session.beginTransaction();
       
       session.save(p1);
       session.save(p2);
       session.save(p3);
       
       tx.commit();
       session.close();
       factory.close();
    }
}
