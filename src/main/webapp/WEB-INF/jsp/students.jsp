<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-Project</title>
</head>
<body>

	<table>
		<tr style="background-color: lightblue">
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Grade</th>
			<th>CreateDate</th>
		</tr>
		<c:forEach items="${students}" var="student" varStatus="status">
			<tr style="background-color:${status.index % 2==0? 'white':'yellow'}">
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.grade}</td>
				<td>${student.createDate}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>