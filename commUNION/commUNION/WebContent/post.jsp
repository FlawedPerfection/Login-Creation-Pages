<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>commUNION post</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="header">
		<img src="img/Logo2.PNG" alt="logo" />
  			
  		<div class="header-right">
    				<a class="active" href="LoginAuth.jsp">Login</a>
				<a href="register.jsp">Register</a>
    				<a href="about.jsp">about</a>
  		</div>
	</div>

	<div class="container">
            <div class="postbox">
                
                <h1>New post</h1>
		<form action="PostServlet" method="post">
                    	<tr>
        			<td>Title:</td>
				<br>
        			<td><input type="text" name="title"></td>
        		</tr>
			<br>
 			<br>
        		<tr>
        			<td>Thread:</td>
				<br>
        			<td><textarea class="mytext" rows="10" cols="60" name="postContent"> </textarea></td>
        		</tr>
			<br>
			<br>
 			<br>
        		<tr>
        			<td></td>
        			<td><input type="submit" value="Submit">&nbsp &nbsp</td>
				
				<td><input type="submit" value="Delete"></td>
        		</tr>
                </form>
		</div> 
	 </div>
</body>
</html>