package com.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       
       Emp2 emp=(Emp2)session.get(Emp2.class,102);
       System.out.println(emp);
       
       Emp2 emp1=(Emp2)session.get(Emp2.class,101);
       System.out.println(emp1);
       
       Emp2 emp2=(Emp2)session.get(Emp2.class,102);
       System.out.println(emp2);
       
       Emp2 emp3=(Emp2)session.get(Emp2.class,106);
       System.out.println(emp3);
       
       Emp2 emp4=(Emp2)session.load(Emp2.class,102);
       System.out.println(emp4);
       
       Emp2 emp5=(Emp2)session.load(Emp2.class,103);
       System.out.println(emp5);
       
       Emp2 emp6=(Emp2)session.load(Emp2.class,107);
       System.out.println(emp6);
       
       session.close();
       factory.close();
       
       
       
       
    }
}
