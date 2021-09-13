package com.ManytoManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoManyMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateManytoMany.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp1 emp1=new Emp1();
		Emp1 emp2=new Emp1();
		emp1.setEid(01);
		emp1.setEname("anant");
		emp2.setEid(02);
		emp2.setEname("pawan");
		
		Project proj1=new Project();
		Project proj2=new Project();
		proj1.setPid(1000);
		proj1.setPname("Android");
		proj2.setPid(1001);
		proj2.setPname("AI");
		
		List<Emp1> listEmp=new ArrayList<Emp1>();
		List<Project> listProj=new ArrayList<Project>();
		listEmp.add(emp1);
		listEmp.add(emp2);
		listProj.add(proj1);
		listProj.add(proj2);
		
		emp1.setProj(listProj);
		proj2.setEmp(listEmp);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(proj1);
		session.save(proj2);
		
		tx.commit();
		session.close();
		factory.close();
		
	}

}
