<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.body {
	font-size: 32px;
}

.nameInfo {
	color: blue;
	margin-left: 30%;
}

.nameInfo a {
	margin-left: 30%;
}

.sendForm {
	margin-top: 30px;
}

.else {
	margin-top: 20px;
	margin-left: 30%;
}

.error {
	color: red;
	text-align: center;
	position: fixed;
	margin-left:100px;
}
</style>
<meta charset="UTF-8">
<title>Send result on email</title>
</head>
<body class="body">
	<div align="left" class="nameInfo">
		Hi ${userName} send result to your email <a href="">logout</a>
	</div>
	<div align="center" class="sendForm">
		<form:form action="proccess_send_result" method="GET"
			modelAttribute="userEmail">
			<label for="email">Your email id: </label>
			<form:input id="email" path="email"></form:input>
			<form:errors id="email" path="email" class="error"></form:errors>
			<input type="submit" value="send">
		</form:form>
	</div>
	<div class="else">
		<a href="">Try to somebody else</a>
	</div>
</body>
</html>