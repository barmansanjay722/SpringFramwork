<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- for geting JSP Expression language to print values -->
<%--      <%@page isELIgnored="false" %>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
<h1>hello this is help page</h1>
<%
 	String name = (String)request.getAttribute("name");
	Integer roll = (Integer)request.getAttribute("rollnumber");
	LocalDateTime dateTime = (LocalDateTime)request.getAttribute("time"); 
	
%>
<p>
 here is name <%=name %>
<br>
 and roll number is <%=roll %>
<br>
 and local data time is <%=dateTime %>  
   
   <!-- geting JSP Expression language to Print Values -->
   
<%--     here name is &{name}
   and roll number is &{roll}
    
    
    <c:foreach var="item" items="${marks }">
    	<h1>${item }</h1>
    </c:foreach> --%>
</p>
</body>
</html>