<%@page import="com.webapp.UserRegistration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="com.webapp.UserRegistration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>this is register page</h2>	
		
	<jsp:useBean id="u" class="com.webapp.User" scope="session"></jsp:useBean>
	
	<%-- 
	
	<jsp:setProperty property="uid" name="u" value='<%=Integer.parseInt(request.getParameter("uid")) %>' />
	<jsp:setProperty property="uname" name="u" value='<%=request.getParameter("uname") %>' />
	<jsp:setProperty property="salary" name="u" value='<%=Integer.parseInt(request.getParameter("salay")) %>' /> 
	
	--%>
	
	<jsp:setProperty property="*" name="u"/>
		
	<%
		int i=UserRegistration.register(u);
	
		if(i>0)
		{
			out.println("registration done sucessfully");
		}
	%>
	
	<h4>to register for another user plz fill form and submit</h4> 
	
	<jsp:include page="index.jsp"></jsp:include>
</body>
</html>