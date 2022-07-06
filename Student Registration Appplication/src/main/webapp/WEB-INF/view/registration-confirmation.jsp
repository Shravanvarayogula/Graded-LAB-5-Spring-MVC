<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
	
<html>

<head>
<meta charset="ISO-8859-1">
<head> 
<title> Registration Confirmation</title>
</head>

<body>

<h3> Your Registration is confirmed! </h3>

<h4> Please find the Details: </h4>

Student Name: ${student.f_name},  ${student.l_name}
<br> 
Student Email : ${student.email}
<br>
Student Course: ${student.branch_name}
<br>
</body>
</html>