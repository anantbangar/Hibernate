package com.OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer 
{
	@Id
	private int ansId;
	private String ans;
	
	@OneToOne(mappedBy="ans")
	private Question ques;
	 
	
	public Answer() 
	{
		super();
	}
	
	public Answer(int ansId, String ans) 
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

	
	public Question getQues() 
	{ 
		return ques; 
	}
	  
	public void setQues(Question ques) 
	{ 
		this.ques = ques; 
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", ans=" + ans + "]";
	}
	
}
