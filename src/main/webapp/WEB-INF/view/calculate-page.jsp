<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
.show_result {
	float: left;
	width: 30%;
	font-size: 24px;
	margin-left: 30%;
	font-size: 24px;
	width: 30%;
}

.logout {
	font-size: 24px;
	float: right;
	width: 30%;
	float: right;
}
</style>
<meta charset="UTF-8">
<title>Calculate page</title>
</head>
<body>
	<div align="center">
		<h1>Love Calculate</h1>
		<hr>
	</div>
	<div class="show_result">
		<h2>The love calculator predicts:</h2>
		${userInfo.userName} and ${userInfo.crushName } are: <br />
		${userInfo.result} <br> 
		<a href="<c:url value = "/send_result_to_email"/>">Send result to email</a> <br> 
		<a href="#">Try with somebody else</a> <br>
		<a href="#">Check user history</a><br>
	</div>
	<div class="logout">
		<a href="logout">Logout</a>
	</div>
</body>
</html>