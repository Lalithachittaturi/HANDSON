<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/donorblooddetails/process"
		modelAttribute="p" method="post">

PatientId:<input type="text" name="PatientId">
		<br>
		<br>
TimeOfTheDay:<input type="text" name="TimeOfTheDay">
		<br>
		<br>
GlucoseLevel:<input type="text" name="GlucoseLevel">
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>