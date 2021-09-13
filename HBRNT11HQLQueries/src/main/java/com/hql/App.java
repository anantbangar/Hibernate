package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session=factory.openSession();
       
       //HQL select 
       String query="from Student";
       Query q=session.createQuery(query);
       List<Student> list = q.list();
       for(Student student : list)
       {
    	   System.out.println(student);
    	   
       }
       
       //HQl delete
       Transaction tx = session.beginTransaction();
       Query q2 = session.createQuery("delete from Student where id=:x");
       q2.setParameter("x",103);
       int row=q2.executeUpdate();
       System.out.println(row+" row deleted....");
       tx.commit();
             
       //HQL select
       Query q3=session.createQuery(query);
       List<Student> list1 = q3.list();
       for(Student student : list1)
       {
    	   System.out.println(student);
    	   
       }
       
       //HQL update
       Transaction tx1 = session.beginTransaction();
       Query q4 = session.createQuery("update Student set city=:c where id=:i");
       q4.setParameter("c","Bhiwandi");
       q4.setParameter("i", 102);
       int row1=q4.executeUpdate();
       System.out.println(row1+" row updated....");
       tx1.commit();
       
       //HQL select
       Query q5=session.createQuery(query);
       List<Student> list2 = q5.list();
       for(Student student : list2)
       {
    	   System.out.println(student);
    	   
       }
       
       //HQL Inner Join
       Query q6 = session.createQuery("select q.quesId,q.ques,a.ansId,a.ans from Question1 as q INNER JOIN q.ans as a");
       List<Object[]> list3 = q6.list();
       for(Object [] arr : list3)
       {
    	   System.out.println(Arrays.toString(arr));
       }
       
       session.close();
       factory.close();
           
    }
    
}
