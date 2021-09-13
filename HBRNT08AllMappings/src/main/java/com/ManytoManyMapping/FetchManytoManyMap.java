package com.ManytoManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchManytoManyMap 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernateManytoMany.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Emp1 emp1=(Emp1)session.get(Emp1.class,1);
		Emp1 emp2=(Emp1)session.get(Emp1.class,2);
		
		System.out.println("Info of Employee with id=1");
		System.out.println("Eid="+emp1.getEid()+" Ename="+emp1.getEname());
		for(Project p:emp1.getProj())
		{
			System.out.println("Pid="+p.getPid()+" Pname="+p.getPname());
		}

		System.out.println("Info of Employee with id=2");
		System.out.println("Eid="+emp2.getEid()+" Ename="+emp2.getEname());
		for(Project p:emp2.getProj())
		{
			System.out.println("Pid="+p.getPid()+" Pname="+p.getPname());
		}
		
		Project proj1=(Project)session.get(Project.class,1000);
		Project proj2=(Project)session.get(Project.class,1001);
		
		System.out.println("Info of Project with id=100");
		System.out.println("Pid="+proj1.getPid()+" Pname="+proj1.getPname());
		for(Emp1 e:proj1.getEmp())
		{
			System.out.println("Eid="+e.getEid()+" Ename="+e.getEname());
		}

		System.out.println("Info of Project with id=101");
		System.out.println("Pid="+proj2.getPid()+" Pname="+proj2.getPname());
		for(Emp1 e:proj2.getEmp())
		{
			System.out.println("Eid="+e.getEid()+" Ename="+e.getEname());
		}
		
		
		
		session.close();
		factory.close();
		
	}
}
