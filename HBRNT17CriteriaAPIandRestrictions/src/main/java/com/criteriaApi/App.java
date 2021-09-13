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
        Criteria c= session.createCriteria(Student.class);
        List<Student> list = c.list();
        for(Student student : list)
        {
        	System.out.println(student);
        }
        
      /*  //this is like - select * from student where name="anant"; 
        c.add(Restrictions.eq("name", "anant"));
        List<Student> list2 = c.list();
        for(Student student : list2)
        {
        	System.out.println(student);
        } */
        
       /*  //this greater than       
        c.add(Restrictions.gt("id",107));
        List<Student> list3 = c.list();
        for(Student student : list3)
        {
        	System.out.println(student);
        } */
        
        c.add(Restrictions.like("name","s%"));
        List<Student> list4 = c.list();
        for(Student student : list4)
        {
        	System.out.println(student);
        }
                     
        session.close();
    }
}
