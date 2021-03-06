<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>

<c:errors path="emp.*"></c:errors>

<c:form action="/p1_ws/saveDetail" method="post" modelAttribute="emp">

name : <c:input path="name"/><br>
age : <c:input path="age"/><br>
gender : <c:radiobutton path="gender" value="Male"/>Male<c:radiobutton path="gender" value="Female"/>Female<br>
hobbies : <c:checkboxes items="${hbs}" path="hobbies"/><br>
department : <c:select path="department" multiple="false">
<c:options items="${dept}"/>
</c:select><br>
salary : <c:input path="salary"/><br>

<button type="submit">submit</button><br>
</c:form>

</body>
</html>