<%@page import="com.xyz.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>

<%
String name=request.getParameter("name");
UserDao ud=new UserDao();
int i=ud.deleteUser(name);

if(i>0){
	response.sendRedirect("ViewUser.jsp");
}
else{
	response.sendRedirect("error.jsp");
}
%>
</body>
</html>