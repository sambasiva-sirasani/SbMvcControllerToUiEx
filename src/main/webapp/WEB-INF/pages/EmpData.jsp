<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Data</h2>
<table border="1">
<tr>
<th>EID</th>
<th>ENAME</th>
<th>EADDR</th>
<th>ESAL</th>
</tr>
<c:forEach items="${list}" var="emp">
						<tr>
							<td>${emp.eid}</td>
							<td>${emp.ename}</td>
							<td>${emp.eaddr}</td>
							<td>${emp.esal}</td>
						</tr>
</c:forEach>
</table>
</body>
</html>