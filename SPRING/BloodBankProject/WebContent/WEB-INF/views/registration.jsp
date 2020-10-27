<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/process" method="post">
		Username<input type="text" name="uname"><br>
		<br> Password<input type="text" name="pwd"><br>
		<br> city<input type="text" name="city"><br>
		<br> bloodGroup<input type="text" name="bg"><br>
		<br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>