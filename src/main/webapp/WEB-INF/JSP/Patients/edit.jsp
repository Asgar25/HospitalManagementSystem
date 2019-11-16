<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit Patients</h2>
	<form:form action="update" method="post" modelAttribute="patient">
	<form:hidden path="id"/>
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><form:input path="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="Male" />Male</td>
				<td><form:radiobutton path="gender" value="Female" />Female</td>
			</tr>	
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
		</table>

		<input type="submit" value="Submit">

	</form:form>

</body>
</html>