<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display</title>
</head>
<body>
${msg}

<table>
<tr><td>Name :</td><td>${emp.name}</td> </tr>
<tr><td>age</td><td>${emp.age}</td></tr>
<tr><td>hobby</td><td>${emp.hobby}</td></tr>
<tr><td>skills</td> <td>${emp.skills}</td> </tr>
<tr><td>country</td> <td>${emp.address.country} </td> </tr>
<tr><td>city</td> <td>${emp.address.city}</td> </tr>
<tr><td>pinCode</td><td>${emp.address.pinCode}</td></tr>
</table>
</body>
</html>