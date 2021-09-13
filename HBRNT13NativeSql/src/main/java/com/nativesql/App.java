package com.nativesql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
        //SQL select
        NativeQuery nq = session.createSQLQuery("select * from student");
        List<Object[]> list = nq.getResultList();
        for(Object[] obj : list)
        {
        	System.out.println(Arrays.toString(obj));
        }
        
        //SQL update
        Transaction tx = session.beginTransaction();
        NativeQuery nq1 = session.createSQLQuery("update student set city='USA' where id=110");
        int executeUpdate = nq1.executeUpdate();
        System.out.println(executeUpdate+" row updated.....");
        tx.commit();
        
        //SQL select
        NativeQuery nq2 = session.createSQLQuery("select * from student where id=110");
        List<Object[]> list2 = nq2.list();
        for(Object[] obj : list2)
        {
        	System.out.println(Arrays.toString(obj));
        }
        
        //SQL delete
        Transaction tx1 = session.beginTransaction();
        NativeQuery nq3 = session.createSQLQuery("delete from student where id=110");
        int executeUpdate2 = nq3.executeUpdate();
        System.out.println(executeUpdate2+" row deleted....");
        tx1.commit();
        
        //SQL select
        NativeQuery nq4 = session.createSQLQuery("select * from student where id=110");
        List<Object[]> list3 = nq4.list();
        for(Object[] obj : list3)
        {
        	System.out.println(Arrays.toString(obj));
        }
        
        session.close();
        factory.close();
    }
}
