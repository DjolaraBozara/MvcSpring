<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add:city</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	This is add page for company: add.jsp!
	<form:form action="/MySpringMvcApp/company/save" method="post"
		modelAttribute="companyDto">
		Company name:<form:input type="text" path="name" id="nameId" />
		<br />
		<form:errors path="name" cssClass="error" />
		<p />
		Company address:<form:input type="text" path="address" id="adressId" />
		<br />
		<form:errors path="address" cssClass="error" />
		<p />
		Street number:<form:input type="text" path="number" id="numberId" />
		<br />
		<form:errors path="number" cssClass="error" />
		<p />
		City:
		<form:select path="cityDto">
		<form:option  value="${companyDto.cityDto.number}" label="${companyDto.cityDto.name}"/>
			<form:options items="${cities}" itemvalue="number" itemLabel="name"/>
		</form:select>
		<form:errors path="cityDto" cssClass="error" />
			<button id="save">Save</button> 
	</form:form>
	
	
</body>
</html>