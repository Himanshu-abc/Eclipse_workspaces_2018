<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display details</title>
</head>
<body>
name : ${p.name} <br>
age : ${p.age}<br>
dob : ${p.dob}<br>
hobby : ${p.hobby} <br>
locality : ${p.address.locality}<br>
city : ${p.address.city}<br>
pinCode : ${p.address.pinCode}<br>
country : ${p.address.country}<br>
</body>
</html>