package com.OnetoOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	private int quesId;
	private String ques;
	
	@OneToOne
	private Answer ans;
	
	public Question()
	{
		super();
	}

	public Question(int quesId, String ques, Answer ans) 
	{
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.ans = ans;
	}

	public int getQuesId() 
	{
		return quesId;
	}

	public void setQuesId(int quesId) 
	{
		this.quesId = quesId;
	}

	public String getQues() 
	{
		return ques;
	}

	public void setQues(String ques) 
	{
		this.ques = ques;
	}

	public Answer getAns() 
	{
		return ans;
	}

	public void setAns(Answer ans) 
	{
		this.ans = ans;
	}

	@Override
	public String toString() 
	{
		return "Question [quesId=" + quesId + ", ques=" + ques + ", ans=" + ans + "]";
	}
	
	
}
