%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer registration</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h2>Register here</h2><br>
    <div class="register">
    <form method="post" action="reg">
    <label><b>User name
    </b></label><br>
    <input type="text" name="uname" id="textbox" placeholder="username">
    <br><br>
    <label><b>Email
    </b>
    </label><br>
    <input type="text" name="email" id="textbox" placeholder="mailid">
    <br><br>
    <label><b>password
    </b>
    </label><br>
    <input type="password" name="pass" id="textbox" placeholder="password">
    <br><br>
    <label><b>Gender
    </b></label><br>
    <input type="radio" name="gender" value="male"/>male
    <input type="radio" name="gender" value="female"/>female
    <input type="radio" name="gender" value="other"/>other
    <br><br>
    <input type="submit" id="sub" value="register">
    <br><br>
    <a href="login.jsp">already registered?sign into account</a>
    </form>
    </div>
</body>
</html>