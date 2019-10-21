<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color: aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>First Page</title>
</head>
<body>

<%= session.isNew() %>
<%=session.getId() %>

<c:out value="${sessionScope.user}"/>

<a href="Second.jsp">Second</a>
</body>
</html>