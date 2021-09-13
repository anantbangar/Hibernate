package com.OnetoManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;
import java.util.List;

@Entity
public class Question1 
{
	@Id
	private int quesId;
	private String ques;
	
	@OneToMany(mappedBy="ques")
	private List<Answer1> ans;
	
	public Question1()
	{
		super();
	}

	public Question1(int quesId, String ques, List<Answer1> ans) 
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

	
	public List<Answer1> getAns() {
		return ans;
	}

	public void setAns(List<Answer1> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question1 [quesId=" + quesId + ", ques=" + ques + ", ans=" + ans + "]";
	}
	
	

		
}
