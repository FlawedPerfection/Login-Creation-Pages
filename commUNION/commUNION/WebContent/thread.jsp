<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Thread</title>
	<meta name="description" content="Chat Application" />
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>

	<div class="header">
		<img src="img/Logo2.PNG" alt="logo" />
  			
  		<div class="header-right">
    		<a href="#">Profile</a>
    		<a href="about.jsp">about</a>
  		</div>
	</div>

	<c:forEach var="post" items="${postList}">
		<a href="post?id=${post.getId()}" class="list-topic-item">
			<p class="list-item-title">${post.getTitle()}</p>
		</a>
	</c:forEach>
	
</body>
</html>