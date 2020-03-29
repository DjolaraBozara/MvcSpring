<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<div>This is page: index.jsp</div>
	<c:url value="/city/add" var="cityAdd"></c:url>
	<a href='${cityAdd}'>Add city</a>
	<c:url value="/company" var="companyHome"></c:url>
	<a href='${companyHome}'>Company home</a>
	<c:url value="/company/add" var="companyAdd"></c:url>
	<a href='${companyAdd}'>Company add</a>
	<c:url value="/company/all" var="companyAll"></c:url>
	<a href='${companyAll}'>Company all</a>
</body>
</html>