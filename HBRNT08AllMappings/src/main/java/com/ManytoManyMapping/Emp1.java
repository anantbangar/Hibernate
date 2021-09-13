package com.ManytoManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Emp1 
{
	@Id
	private int eid;
	private String ename;
	
	@ManyToMany 
	private List<Project> proj;
	
	public Emp1()
	{
		super();
	}
	
	public Emp1(int eid, String ename, List<Project> proj)
	{
		super();
		this.eid=eid;
		this.ename=ename;
		this.proj=proj;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setProj(List<Project> proj)
	{
		this.proj=proj;
	}
	
	public List<Project> getProj()
	{
		return proj;
	}

}
