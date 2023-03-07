<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
.body {
	font-size: 32px;
}

.name {
	color: blue;
	margin-left: 30%;
}

.message {
	color: blue;
	text-align: center;
}

.else {
	margin-top: 20px;
	margin-left: 30%;
}
</style>
<meta charset="UTF-8">
<title>Confirm send result to email</title>
</head>
<body class="body">
	<div class="name">${userName}</div>

	<div class="message">Email successfully sent to
		${userEmail.email}</div>
	<div class="else">
		<a href="">Try to somebody else</a>
	</div>
</body>
</html>