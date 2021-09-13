package com.fetch;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

@Entity
public class Emp2
{
	@Id
	private int id;
	
	private String name;

	public Emp2()
	{
		super();
	}
	
	public Emp2(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
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
	
	public String toString()
	{
		return "Id="+id+" Name="+name;
	}

}
