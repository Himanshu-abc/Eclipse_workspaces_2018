<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">index</a>

<%

String b=(String)session.getAttribute("session");

if(Boolean.valueOf(b)){
	out.println("welcome ...!");
}
else {
	out.println("you are not in session");
	
	%>   <jsp:include page="login.jsp"></jsp:include>  <%
	
}
%>
</body>
</html>