<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" 
    class="com.traning.entity.ValidateUser" 
     scope="request"/>

<jsp:setProperty property="*" name="user"/>

<c:if test="${user.validate()}">
<jsp:forward page="success.jsp"/>
</c:if>

<c:if test="${!user.validate()}">
<jsp:forward page="login.jsp">
 <jsp:param 
    value="Invalid userName or passWord" 
       name="msg"/>
 </jsp:forward>
</c:if>

</body>
</html>

