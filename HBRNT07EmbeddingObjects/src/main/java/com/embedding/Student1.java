package com.embedding;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student1 
{
	@Id
	private int id;
	private String name;
	private Certificate certi;
	
	public Student1()
	{
		super();
	}
	
	public Student1(int id,String name,Certificate certi)
	{
		super();
		this.id=id;
		this.name=name;
		this.certi=certi;
		
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCerti(Certificate certi)
	{
		this.certi=certi;
	}
	
	public Certificate getCerti()
	{
		return certi;
	}
	
	public String toString()
	{
		return "ID="+id+" NAME="+name+" Certi="+certi;
	}

}
