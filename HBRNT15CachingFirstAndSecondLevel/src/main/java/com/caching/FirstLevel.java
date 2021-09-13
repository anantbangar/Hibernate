package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevel 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        Student student = session.get(Student.class,105);
        System.out.println(student);
        
        System.out.println("working something......");

        Student student1 = session.get(Student.class,105);
        System.out.println(student1);
                        
        System.out.println("student object present in session ? "+session.contains(student));
        System.out.println("student1 object present in session ? "+session.contains(student1));
        
        session.close();
        
       //System.out.println("student1 object present in session ? "+session.contains(student1));
        
        factory.close();
				
	}

}
