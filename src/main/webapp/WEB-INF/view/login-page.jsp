<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<div align="center">
		<h1>Login page</h1>
		<hr>
		<a href="register">register</a>
		<form:form action="submitLoginForm" method="GET" modelAttribute="user">
			<p>
				<label for="userName">User name: </label>
				<form:input id="userName" name="name" path="userName" />
			</p>
			<p>
				<label for="password">Password: </label>
				<form:password id="password" name="password" path="password" />
			</p>
		</form:form>
	</div>
</body>
</html>