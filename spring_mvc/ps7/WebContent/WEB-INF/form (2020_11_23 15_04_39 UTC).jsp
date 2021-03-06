<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<body>
<c:errors path="st.*"></c:errors>
<c:form action="/ps7/save" method="post" modelAttribute="st">

id : <c:input path="id"/><br>

name : <c:input path="name"/><br>

hobby : <c:checkboxes items="${hb}" path="hobbies"/><br>

qualification : <c:select path="qualifications">
<c:options items="${quals}"/>
</c:select><br>

gender : <c:radiobutton path="gender" value="Male" />Male<c:radiobutton path="gender" value="Female"/>Female<br>

city : <c:select path="city.cityCode" items="${city}" itemLabel="cityName" itemValue="cityCode"></c:select><br>

<button type="submit">submit</button>
</c:form>

</body>
</html>