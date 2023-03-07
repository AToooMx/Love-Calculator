<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<div align="center">
		<h1>Love calculator</h1>
		<hr>
		<form:form action="calculate" method="GET" modelAttribute="userInfo">
			<p>
				<label for="yn">Your name </label>
				<form:input name="userName" id="yn" path="userName" />
				<form:errors path="userName" class="error" />
			</p>
			<p>
				<label for="cn">Crush name </label>
				<form:input name="crushName" id="yn" path="crushName" />
				<form:errors path="crushName" class="error" />
			</p>
			<p>
				<form:checkbox path="isChecked"
					label="I am agreeing that this us so fun" />
				<form:errors path="isChecked" class="error" />
			</p>
			<p>
				<input type="submit" value="calculate">
			</p>
		</form:form>
	</div>
</body>
</html>