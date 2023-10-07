<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h2> login to start shopping</h2><br>
<div class="login">
<form id="login" action="log" method="post">
<label><b> User name
</b>
</label>
<input type="text" name="uname" id="textBox" placeholder="username">
<br><br>
<label><b>Password
</b>
</label>
<input type="Password" name="pass" id="textBox" placeholder="password">
<br><br>
<input type="submit" id="sub" value="log in">
<br><br>
<a href="register.jsp">New user? Register here</a>
</form>
</div>

</body>
</html>