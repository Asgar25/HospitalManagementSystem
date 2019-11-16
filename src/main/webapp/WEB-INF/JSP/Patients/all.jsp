<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/testStyle.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<h2>List of All Patient s</h2>

<a href="./test">Add</a>
	<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Mobile Number</th>
		<th>Gender</th>
		<th>Email</th>
		<th>Actions</th>
	</tr>
	

	<c:forEach items="${patients}" var = "p">
	<tr>
		<td>${p.firstName}</td>
		<td>${p.lastName}</td>
		<td>${p.mobileNumber}</td>
		<td>${p.gender}</td>
		<td>${p.email}</td>
		<td><a href="edit?id=${p.id}">Edit</a> | <a href="delete?id=${p.id}">Delete</a> </td>
	</tr>

	</c:forEach>
	
	
	</table>
</body>
</html>