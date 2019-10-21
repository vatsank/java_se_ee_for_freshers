<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style type="text/css">
.img-thumbnail{

border-color: red;
border-radius: 5px;
}

img{
width: 100px;
height: 100px;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@ include file="header.html" %>
<p style="color:red">
<c:out value="${param.msg}"/>
</p>

<div class="col-md-6">
<form action="validate.jsp" method="post" class="form">

<div class="form-group">
	<label>User Name</label>
	<input type="text" name="userName" class="form-control">
</div>
<div class="form-group">
	<label>Pass Word</label>
	<input type="password" name="passWord" class="form-control">

</div>
<div class="form-group">
	<input type="reset" value="clear" class="btn btn-primary" id="resetBtn">
	<input type="submit" value="Login" class="btn btn-danger">

</div>
</form>
</div>
<hr>
<jsp:include page="footer.jsp"/>

<hr>
<script type="text/javascript" src="scripts/script.js"></script>
</body>
</html>