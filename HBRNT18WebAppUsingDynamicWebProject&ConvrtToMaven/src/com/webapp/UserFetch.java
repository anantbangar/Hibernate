package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserFetch extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		processRequest(req,res);
	}

	protected void doGPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		processRequest(req,res);
	}
	
	public void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("<h2>this is show database page <h2>");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Query query=session.createQuery("from User");
		
		List<User> list=query.list();
		
		for(User u:list)
		{
			out.println("user id: "+u.getUid()+"<br>");
			out.println("user name: "+u.getUname()+"<br>");
			out.println("user salary: "+u.getSalary()+"<br><br>");
		}
		
		session.close();
		factory.close();
	}
}
