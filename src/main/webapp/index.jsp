<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="login-style.css">  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
    <form id="signup" action="login" method="POST">
        <div class="header">
            <h3>Sign Up</h3>
            <p>You want to fill out this form</p>
        </div>
        <div class="sep"></div>
			<div class="inputs">
            	<input type="textbox" placeholder="username" name="username"/>
            	<input type="password" placeholder="Password" name="pass" />
			 	<input type="Submit" value="Submit"/>
        	</div>
    </form>
	<div id="ajaxResponse" class="container"></div>
</body>
</html>