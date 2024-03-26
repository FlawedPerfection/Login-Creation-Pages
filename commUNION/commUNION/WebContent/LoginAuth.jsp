<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>commUNION login</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
	<div class="header">
		<img src="img/Logo2.PNG" alt="logo" />
  			
  		<div class="header-right">
    				<a class="active" href="login.jsp">Login</a>
				<a href="register.jsp">Register</a>
    				<a href="about.html">about</a>
  		</div>
	</div>
	<div class="container">
            <div class="box">
                
                <h1>Login Account</h1>
    			<form action="LoginAuth" method="post">
    				<p>Username</p>
					<input type="text" name="username">
					<p>Password</p>
					<input type="password" name="password">
					<input type="submit" value="Login">
					
					<a href="#">Forget Password?</a><br>
                    <a href="register.jsp">Create New Account</a>
                </form>
	    </div>
	</div>
</body>
</html>

