<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<h1>${message}</h1>

<form:errors path="student.*"></form:errors>

<form action="/ps4/StudentDetail.html" method="post">

<table align="center" width="30%" border="1">
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Hobby</td><td><input type="text" name="hobby"></td></tr>
<tr><td>mobile_number</td><td><input type="text" name="mobileNumber"></td></tr>
<tr><td>date(dd/mm/yyyy)</td><td><input type="text" name="date"></td></tr>
<tr><td>skills</td><td>
<select name="skills" multiple="multiple">
<option>c</option>
<option>c++</option>
<option>java</option>
<option>python</option>
<option>other</option>
</select>
</td></tr>
</table>

<table align="center" width="30%" border="1">
<tr><td>Country</td><td><input type="text" name="studentAddess.country"></td></tr>
<tr><td>City</td><td><input type="text" name="studentAddess.city"></td></tr>
<tr><td>locality</td><td><input type="text" name="studentAddess.locality"></td></tr>
<tr><td>zipCode</td><td><input type="text" name="studentAddess.zipCode"></td></tr>

<tr><td></td><td><input type="submit" value="send"></td></tr>
<tr><td></td><td><input type="reset" value="re-set"></td></tr>
</table>

</form>
</body>
</html>