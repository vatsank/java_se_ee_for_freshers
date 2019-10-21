<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using JSTL</title>
<style type="text/css">

table {
border: 2px solid yellow;
border-collapse: collapse;
margin-left: auto;
margin-right: auto;
}
tr,td,th{

border: 2px solid yellow;
}
.alignCenter{

text-align: center;
}
</style>
</head>
<body>

<c:set var="majorHeading" value="Popular Books" />
<c:set var="subHeading" value="Novels" />

<h1 class="alignCenter"><c:out value="${majorHeading}"/></h1>
<h4 class="alignCenter"><c:out value="${subHeading}"/></h4>

<table>
<tr>
<th>Id</th>
<th>AuthorName</th>
<th>Phone Number</th>
<th>Email</th>
</tr>
<c:forEach var="eachAuthor" items="${requestScope.foundAuthor}">

<tr>
<td><c:out value="${eachAuthor.id}"/></td>
<td><c:out value="${eachAuthor.authorName}"/></td>
<td><c:out value="${eachAuthor.phoneNumber}"/></td>
<td><c:out value="${eachAuthor.email}"/></td>

</tr>
</c:forEach>
</table>
<p>User</p>
<c:out value="${user}"/>

<a href="next.jsp">next</a>
</body>
</html>