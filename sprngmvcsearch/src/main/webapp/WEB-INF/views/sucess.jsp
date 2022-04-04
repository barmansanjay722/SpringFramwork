<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>here is the Details</h1>
<p>
Name is ${student.name }
<br>
Student Id is ${student.id }
<br>
Student DOB is ${student.dob }
<br>
Here is the courses ${student.courses }
<br>
Student Gender is ${student.gender }
<br>
Type are ${student.type }
<br>
Student Address City is ${student.address.city }
<br>
Student Address street is ${student.address.street }
</p>
</body>
</html>