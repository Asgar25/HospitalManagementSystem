<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/testStyle.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<h2>Lis t of All Pre   scri   ption</h2>

	Name : ${ patient.firstName }
	<table>
		<c:forEach items="${patient.prescriptions}" var="p">
			<tr>
				<td>hello ${p.id}</td>

			</tr>

		</c:forEach>


	</table>
</body>
</html>