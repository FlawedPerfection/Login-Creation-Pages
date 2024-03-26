<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>commUNION user register</title>
</head>
<body>

	<div align="center">
	 
	  <form action="<%= request.getContextPath() %>/register" method="post">
		   <table style="with: 80%">
			    <tr>
				     <td>First Name</td>
				     <td><input type="text" name="firstName" /></td>
			    </tr>
			    <tr>
				     <td>Last Name</td>
				     <td><input type="text" name="lastName" /></td>
			    </tr>
			    <tr>
				     <td>UserName</td>
				     <td><input type="text" name="username" /></td>
			    </tr>
			    <tr>
				     <td>Password</td>
				     <td><input type="password" name="password" /></td>
			    </tr>
		   </table>
	   <input type="submit" value="Register" />
	  </form>
	  
	 </div>

</body>
</html>