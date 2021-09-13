package com.embedding;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate 
{
	private String certiName;
	private String duration;
	
	public Certificate()
	{
		super();
	}
	
	public Certificate(String certiName,String duration)
	{
		super();
		this.certiName=certiName;
		this.duration=duration;
	}
	
	public void setCertiName(String certiName)
	{
		this.certiName=certiName;
	}
	
	public String getCertiName()
	{
		return certiName;
	}
	
	public void setDuration(String duration)
	{
		this.duration=duration;
	}
	
	public String getDuration()
	{
		return duration;
	}
	
	public String toString()
	{
		return "CertiName="+certiName+" Duration="+duration;
	}

}
