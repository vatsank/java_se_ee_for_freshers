<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
background-color: fuchsia;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${sessionScope.user}"/>

<%= session.isNew() %>
<%=session.getId() %>

<% session.invalidate(); %>
<a href="Third.jsp">Third</a>
</body>
</html>