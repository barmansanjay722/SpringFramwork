<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h1>Success page</h1>
 <h1>${Header }</h1>
 <p>${Desc }</p>
 <p>
 Welcome ${user.userName }
 <br>
 Your email address is ${user.email }
 <br>
 Your password is ${user.password }
</p>
</body>
</html>