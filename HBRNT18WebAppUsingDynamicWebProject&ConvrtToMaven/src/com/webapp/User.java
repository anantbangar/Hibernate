package com.webapp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	private int uid;
	private String uname;
	private int salary;
	
	public int getUid() 
	{
		return uid;
	}
	
	public void setUid(int uid) 
	{
		this.uid = uid;
	}
	
	public String getUname() 
	{
		return uname;
	}
	
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	
	public int getSalary() 
	{
		return salary;
	}
	
	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
	
	

}
