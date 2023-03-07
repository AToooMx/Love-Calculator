<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation page</title>
</head>
<body>
	<div align="center">
		<h1>Your registration is seccessful</h1>
		<hr>
		<h2>The details about you:</h2>
		<p>Name : ${userReg.name }</p>
		<p>User name : ${userReg.userName }</p>
		<p>Password : ${userReg.password }</p>
		<p>Age : ${userReg.age }</p>
		<p>Country : ${userReg.country }</p>
		<p>
			Hobbies :
			<c:forEach var="hobby" items="${userReg.hobbies}">
				${hobby}
			</c:forEach>
		</p>
		<p>Gender : ${userReg.gender }</p>
		<p>Email : ${userReg.userCommunicationDto.email }</p>
		<p>phone : ${userReg.userCommunicationDto.phone }</p>
	</div>
</body>
</html>