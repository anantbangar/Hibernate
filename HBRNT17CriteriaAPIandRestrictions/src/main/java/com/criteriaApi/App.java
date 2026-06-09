package com.criteriaApi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        
        //this is like - select all or select * from student;
        System.out.println("showing all students------");
        Criteria c= session.createCriteria(Student.class);
        List<Student> list = c.list();
        for(Student student : list)
        {
        	System.out.println(student);
        }
        
        //this is like - select * from student where name="anant"; 
        System.out.println("showing students having name is \"anant\"------");
        Criteria c1= session.createCriteria(Student.class);
        c1.add(Restrictions.eq("name", "anant"));
        List<Student> list2 = c1.list();
        for(Student student : list2)
        {
        	System.out.println(student);
        }
        
        //this greater than  
        System.out.println("showing students those id is greater than \"107\"------");
        Criteria c2= session.createCriteria(Student.class);
        c2.add(Restrictions.gt("id",107));
        List<Student> list3 = c2.list();
        for(Student student : list3)
        {
        	System.out.println(student);
        }
        
        System.out.println("showing students those name start with \"s\"------");
        Criteria c3= session.createCriteria(Student.class);
        c3.add(Restrictions.like("name","s%"));
        List<Student> list4 = c3.list();
        for(Student student : list4)
        {
        	System.out.println(student);
        }
                     
        session.close();
    }
}
