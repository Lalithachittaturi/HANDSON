<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue;">
	<form action="${pageContext.request.contextPath}/process" method="post">
		<h1 style="color: blue;">Requester Login Credentials</h1>
		<tr>
			<td>Username:</td>
			<label for="firstName"></label>
			<input id="input-1" placeholder="Enter firstname" type="text" />
			<br>
			<br>
			<td>Password:</td>
			<label for="lastName"></label>
			<input id="input-1" placeholder="Enter lastname" type="text" />
			<br>
			<br>
			<input type="submit" value="login" />
		</tr>
	</form>
</body>
</html>