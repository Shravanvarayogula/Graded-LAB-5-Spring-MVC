<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User Registration Form</title>
</head>
<body>
	<form action="processForm" modelAttribute="student"></form>
	<br>
	<br> First Name :
	<form:input path="f_name" value="f_name"/>
	<br>
	<br> Last Name :
	<form:input path="l_name" value="l_name" />
	<br> Email Address :
	<form:input path="email" />
	<br>
	<br> Branch Name :
	<form:input path="branch_name" value="branch_name"/>
	<br> Country :
	<form:input path="country" value="country"/>
	<br>
	<br>
	<input type="submit" values="submit" />
</body>
</html>