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
		action="${pageContext.request.contextPath}/requestblooddetails/process"
		modelAttribute="p" method="post">

PatientName:<input type="text" name="PatientName" />
		<br>
		<br>
RequesterBloodGroup:<input type="text" name="RequesterBloodGroup" />
		<br>
		<br>
City:<input type="text" name="City" />
		<br>
		<br>
DonorName:<input type="text" name="DonorName" />
		<br>
		<br>
HospitalName:<input type="text" name="HospitalName" />
		<br>
		<br>
ContactName:<input type="text" name="ContactName" />
		<br>
		<br>
ContactNumber:<input type="text" name="PatientName" />
		<br>
		<br>
		<input type="submit" value="submit">

	</form:form>
</body>
</html>