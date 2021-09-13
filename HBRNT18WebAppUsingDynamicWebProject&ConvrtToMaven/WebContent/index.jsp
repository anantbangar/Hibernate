<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>this is index page plz enter info</h2>
	<form action="register.jsp" method="post">
		Enter the id <input type="text" name="uid" /><br>
		Enter the name <input type="text" name="uname"><br>
		Enter the salary <input type="text" name="salary"><br>
		<input type="submit" value="submit">
	</form>
	
	<form action="UserFetch" target="_blank">
		<h3>to see database click on show_db</h3>
		<input type="submit" value="show_db">
	</form>
</body>
</html>