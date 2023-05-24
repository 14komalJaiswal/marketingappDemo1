<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Lead Demo.....</title>
</head>
<body>
<table>
<tr>
<th>firstName</th>
<th>lastName</th>
<th>email</th>
<th>mobile</th>
</tr>
<c:forEach var="leads" items="${leaddemo}">
<tr>
<td>${leads.firstName}</td>
<td>${leads.lastName}</td>
<td>${leads.email}</td>
<td>${leads.mobile}</td>
<td><a href="delete?id=${leads.id}">Delete</a>
<td><a href="update?id=${leads.id}">update</a>
</tr>
</c:forEach>
</table>
</body>
</html>