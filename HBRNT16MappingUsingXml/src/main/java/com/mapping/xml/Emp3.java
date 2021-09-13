package com.mapping.xml;

public class Emp3 
{
	private int id;
	private String name;
	private String address;
	private String phone;
	
	public Emp3()
	{
		super();
	}
	
	public Emp3(int id, String name, String address, String phone)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
		
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
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhone(String phone)
	{
		this.phone=phone;
	}
	
	public String getPhone()
	{
		return phone;
	}

	@Override
	public String toString() {
		return "Emp3 [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
	
	

}
