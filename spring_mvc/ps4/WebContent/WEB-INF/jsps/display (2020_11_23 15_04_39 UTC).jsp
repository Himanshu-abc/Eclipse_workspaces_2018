<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body>
${message}

<table >

<tr><td>Name</td><td>${st.name}</td></tr>

<tr><td>Hobby</td><td>${st.hobby}</td></tr>

<tr><td>mobile_number</td><td>${st.mobileNumber}</td></tr>

<tr><td>date</td><td>${st.date}</td></tr>

<tr><td>skills</td><td>${st.skills}</td> </tr>

<tr><td>country</td><td>${st.studentAddess.country}</td></tr>

<tr><td>city</td><td>${st.studentAddess.city}</td></tr>

<tr><td>street</td><td>${st.studentAddess.locality}</td></tr>

<tr><td>zipCode</td><td>${st.studentAddess.zipCode}</td></tr>

</table>

</body>
</html>