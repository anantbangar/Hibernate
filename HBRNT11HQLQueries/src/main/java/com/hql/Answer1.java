package com.hql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer1 
{
	@Id
	private int ansId;
	private String ans;
	
	@ManyToOne
	private Question1 ques;
	 
	public Answer1() 
	{
		super();
	}
	
	public Answer1(int ansId, String ans) 
	{
		super();
		this.ansId = ansId;
		this.ans = ans;
	}

	public int getAnsId() 
	{
		return ansId;
	}

	public void setAnsId(int ansId) 
	{
		this.ansId = ansId;
	}

	public String getAns() 
	{
		return ans;
	}

	public void setAns(String ans) 
	{
		this.ans = ans;
	}

	
	public Question1 getQues() 
	{ 
		return ques; 
	}
	  
	public void setQues(Question1 ques) 
	{ 
		this.ques = ques; 
	}

		
}

	

