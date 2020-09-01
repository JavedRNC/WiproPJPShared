<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<h1 align="center"> Entered Data </h1> <br><hr><br>
<div align="center">
Science Marks : ${ marks.science } <br>
Math Marks : ${ marks.math } <br>
English Marks : ${ marks.english } <br><br>
Total Marks : ${ marks.science + marks.math + marks.english }
</div>
</body>
</html>