<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Authors</title>
<style type="text/css">

table {
border: 2px solid green;
border-collapse: collapse;
margin-left: auto;
margin-right: auto;
}
tr,td,th{

border: 2px solid green;
}
.alignCenter{

text-align: center;
}
</style>
</head>
<body>
<%! String majHeading ="Popular Authors"; %>
<h1 class="alignCenter"><%=majHeading%></h1>

<%

String subHeading = "Self Motivation";

%>

<h4 class="alignCenter"><%=subHeading%></h4>
<table>
<tr>
<th>Id</th>
<th>AuthorName</th>
<th>Phone Number</th>
<th>Email</th>
</tr>
<% 

  List<Author> authorList =(ArrayList<Author>)request.getAttribute("foundAuthor");
for(Author eachAuthor:authorList){
	
	%>
<tr>
<td><% out.println(eachAuthor.getId()); %></td>
<td><% out.println(eachAuthor.getAuthorName()); %></td>
<td><% out.println(eachAuthor.getPhoneNumber()); %></td>
<td><% out.println(eachAuthor.getEmail()); %></td>

</tr>
<%} %>
</table>
</body>
</html>