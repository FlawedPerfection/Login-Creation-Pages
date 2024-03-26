<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>commUNION user registration page</title>
	<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="header">
		<img src="img/Logo2.PNG" alt="logo" />
  			
  		<div class="header-right">
    		<a href="/LoginAuth.jsp">Login</a>
			<a class="active" href="/register.jsp">Register</a>
    		<a href="/about.jsp">about</a>
  		</div>
	</div>
	<div align="center" class="container">
			<div class="regbox">
				<h1>Register Account</h1>
	 
	  <form action="<%= request.getContextPath() %>/register" method="post">
		   	<P>First Name</p>
			<input type="text" name="firstName" />
					    
			<p>Last Name</p>
			<input type="text" name="lastName" />
					   
			<p>UserName</p>
			<input type="text" name="username" />
					    
			<p>Password</p>
			<input type="password" name="password" />
					    
			<input type="submit" value="Register" />
	   
	  		<a href="LoginAuth.jsp">Already have Account?</a>
	  </form>
	 </div>
	 </div>

</body>
</html>