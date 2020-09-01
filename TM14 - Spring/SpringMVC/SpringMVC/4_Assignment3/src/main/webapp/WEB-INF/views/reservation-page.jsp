<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>
	<form:form action="submitForm" modelAttribute="marks">
	 	Science Marks: <form:input path="science" />         
     	<br><br>
        Maths Marks: <form:input path="math" />  
        <br><br>
        English Marks: <form:input path="english" />  
        <br><br>
        <input type="submit" value="Submit" />      
    </form:form>    
</body>
</html>