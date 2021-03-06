<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" isThreadSafe="true"%>
    
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>

<h1><c:errors path="p.*" ></c:errors></h1>

<c:form action="/ps5/register" method="post" modelAttribute="p">

Name : <c:input path="name"/><br>
age : <c:input path="age"/><br>
DOB : <c:input path="dob"/><br>
hobby : <c:select path="hobby"><br>
<c:option value="volleyball">volleyball</c:option>
<c:option value="football">football</c:option>
<c:option value="cricket">cricket</c:option>
<c:option value="sacred-games">sacred-games</c:option>
<c:option value="other">other</c:option>
</c:select><br>

locality : <c:input path="address.locality"/><br>
city : <c:input path="address.city"/><br>
pinCode : <c:input path="address.pinCode"/><br>
country : <c:input path="address.country"/><br>

<c:button name="submit">submit</c:button>
</c:form>

</body>
</html>