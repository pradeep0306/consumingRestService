<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googlesapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<table class="table table-striped">  
<tr><th>Id</th><th>Name</th><th>Email</th><th>Phone</th><th>Website</th><th>Company</th></tr>  
<c:forEach var="user" items="${result}">

 <tr>  
   <td>${user.id}</td>  
   <td>${user.name}</td>  
   <td>${user.email}</td>  
   <td>${user.phone}</td>  
   <td>${user.website}</td>  
   <td>${user.company.name}</td>  
   
   </tr>

</c:forEach>
</table>

 </body>
</html>