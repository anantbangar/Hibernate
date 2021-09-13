package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        
        Query query = session.createQuery("from Student");
        query.setFirstResult(5);
        query.setMaxResults(3);
        List<Student> list = query.getResultList();
        for(Student student : list)
        {
        	System.out.println(student);
        }
        
        session.close();
        factory.close();
    }
}
