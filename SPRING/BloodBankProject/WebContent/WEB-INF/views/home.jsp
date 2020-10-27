<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Bank Management</title>

</head>
<style>
h1 {
	text-align: center;
}

p {
	text-align: center;
}

img {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>

<body style="background-color: lightgrey;">
	<h1 style="color: red;">Welcome to Blood Bank Management</h1>
	<center>
		<h3>Donor (or) Requester</h3>
		Category 1: <a href="${pageContext.request.contextPath}/requestblooddetails/">requestblooddetails</a><br><br>
		Category 2: <a href="${pageContext.request.contextPath}/donorblooddetails/">donorblooddetails</a><br><br>

	</center>
	<center>
		<a href="${pageContext.request.contextPath}/DonorLogin/">DonorLogin</a><br>
		<br>
	</center>
	<center>
		<a href="${pageContext.request.contextPath}/RequesterLogin/">RequesterLogin</a><br>
		<br>
	</center>
	<form action="${pageContext.request.contextPath}/req" method="post">
		<center>
					User Requirement: <select name="reqType">
				<option value="donor"><a href="registration.jsp"></a>Donor
				</option>
				<option value="requestor"><a href="registration.jsp"></a>Requestor
				</option>
			</select> <br> <br>

			<button type="Submit">Submit</button>
	</form>
	<br>
	<!-- <img
		src="C:\Users\VINUTHNA\Desktop\HCL NOTES\images\BloodBankUser1.jpg"
		style="" "500" height="300"> -->
	<p style="color: black;">A blood bank is a center where blood
		gathered as a result of blood donation is stored and preserved for
		later use in blood transfusion. The term "blood bank" typically refers
		to a division of a hospital where the storage of blood product occurs
		and where proper testing is performed (to reduce the risk of
		transfusion related adverse events). However, it sometimes refers to a
		collection center, and indeed some hospitals also perform collection.
		Blood banking includes tasks related to blood collection, processing,
		testing, separation, and storage.</p>
</body>
</html>