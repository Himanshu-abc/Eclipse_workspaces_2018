<%@page import="java.util.ArrayList"%>
<%@page import="ejbpackage.ListElements"%>
<%@page import="java.util.List"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="ejbpackage.ListElementsRemote"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%!   

private ListElementsRemote values;
       
      public void jspInit(){
    	  
    	  try{
    		  
    		  InitialContext ic=new InitialContext();
    		  values=(ListElementsRemote)ic.lookup("java:global/t2_stateful_bean/ListElements");
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e);
    	  }
 }
      
%>
<%

if(request.getParameter("addnum")!=null){
	
	int e=Integer.parseInt(request.getParameter("t1"));
	values.addElement(e);
}

if(request.getParameter("remnum")!=null){

	int e=Integer.parseInt(request.getParameter("t1"));
	values.removeElement(e);
}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>
</head>
<body>
<form name="abc" method="post">
<input type="text" name="t1"><br><br>
<input type="submit" value="add" name="addnum"><br>
<input type="submit" value="remove" name="remnum"><br>

<%
if(values!=null){
	
	List<Integer> list=values.getElements();
	
	for(int i:list){
		out.println("<br> "+i);
	}
	out.println("<br> size = "+list.size());
}
%>

</form>
</body>
</html>