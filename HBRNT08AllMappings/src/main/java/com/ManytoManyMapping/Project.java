package com.ManytoManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany
	private List<Emp1> emp;

	public Project() 
	{
		super();
	}

	public Project(int pid, String pname, List<Emp1> emp) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.emp = emp;
	}

	public int getPid() 
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public List<Emp1> getEmp() 
	{
		return emp;
	}

	public void setEmp(List<Emp1> emp)
	{
		this.emp = emp;
	}
	
	
	
	
	
	

}
