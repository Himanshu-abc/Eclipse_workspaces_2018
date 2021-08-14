<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>


<style>
.err{
color:#F00;
}
</style>


</head>
<body>
<form:form action="doEmpReg1" modelAttribute="emp" method="post">
Gender <form:radiobutton path="gender" value="MALE"/>Male <form:radiobutton path="gender" value="FEMALE"/>Female
<br>
Emp ID <form:input type="text" path="empid" /><br>
Name <form:input type="text" path="name" /><br>
City
<form:select path="city.cityCode" items="${cts}" itemLabel="cityName" itemValue="cityCode"/>
<br>

Hobbies <form:checkboxes items="${hbs}" path="hobbies"/><br>

Qualification <form:select path="qualifications">
<form:options items="${quals}"/>
</form:select>
<br>

Salary <form:input path="salary"/><br>

<button type="submit">Submit</button>
</form:form>
</body>
</html>