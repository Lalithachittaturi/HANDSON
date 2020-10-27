<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue;">
	<form action="${pageContext.request.contextPath}/DonorLogin/process" modelAttribute="p" method="post">>
		<h1 style="color: blue;">Donor Login Credentials</h1>
		Username<input type="text" name="uname"><br> <br>
		Password<input type="text" name="pwd"><br> <br> 
		<button type="submit">login</button>
		<br> <br> <br> <br>
	</form>
	</tr>
</body>
</html>