<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All companies</title>
</head>
<body>
	<table>
		<tbody>
			<tr>		
			<th>Name</th>
			<th>Address</th>
			<th>Number</th>
			<th>City</th>
			<th>Edit</th>	
			<th>Remove</th>
			</tr>
			<c:forEach items="${companies}" var="company">
			<c:url value="/company/remove" var="remove">
				<c:param name="id" value="${company.id}"></c:param>
			</c:url>
			<c:url value="/company/edit" var="edit">
				<c:param name="id" value="${company.id}"></c:param>
				<c:param name="name" value="${company.name}"></c:param>
				<c:param name="address" value="${company.address}"></c:param>
				<c:param name="number" value="${company.number}"></c:param>
				<c:param name="cityId" value="${company.cityDto.number}"></c:param>
			</c:url>
				<tr>
					<td>${company.name }</td>
					<td>${company.address }</td>
					<td>${company.number }</td>
					<td>${company.cityDto.name}</td>
					<td><a href="${edit}">edit</a></td>
					<td><a href="${remove}">remove</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>