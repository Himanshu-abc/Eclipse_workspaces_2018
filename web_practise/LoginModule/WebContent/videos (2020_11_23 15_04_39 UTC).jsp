<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            <%
            response.setHeader("cache-control","no-cache,no-store,must-revalidate");
            
            response.setHeader("pragma","no-cache");
  		  
  		    response.setHeader("expires","0");
  		  
   			if(session.getAttribute("uname")==null){
			response.sendRedirect("index.jsp");
			}
			%>
			
			<iframe width="560" height="315" src="https://www.youtube.com/embed/Srt8QReWCLM" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>
</body>
</html>