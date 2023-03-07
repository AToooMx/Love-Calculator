<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<meta charset="UTF-8">
<title>Register page</title>
</head>
<body>
	<div align="center">
		<h1>Please register here</h1>
		<hr>
		<a href="login">login</a>
		<form:form action="submitRegistrationForm" method="GET"
			modelAttribute="userReg">
			<p>
				<label for="name">User: </label>
				<form:input id="name" name="name" path="name" />
			</p>
			<p>
				<label for="userName">User name: </label>
				<form:input id="userName" name="name" path="userName" />
				<form:errors id="userName" name="userName" path="userName" class="error"/>
			</p>
			<p>
				<label for="password">Password: </label>
				<form:password id="password" name="password" path="password" />
			</p>
			<p>
				<label for="date">Date of Birth: </label>
				<form:input id="date" name="date" path="date" />
				<form:errors id="date" name="date" path="date" class="error" />
			</p>
			<p>
				<label for="age">Age: </label>
				<form:input id="age" name="age" path="age" />
				<form:errors id="age" name="age" path="age" class="error"/>
			</p>
			<p>
				<label for="country">Country: </label>
				<form:select path="country" id="country">
					<form:option value="Ukraine" label="Ukraine"></form:option>
					<form:option value="Polan" label="Poland"></form:option>
					<form:option value="USA" label="USA"></form:option>
				</form:select>
			</p>
			<p>
				<label>Hobbies: </label>
				<form:checkbox path="hobbies" value="programming"
					label="programming" />
				<form:checkbox path="hobbies" value="reading" label="reading" />
				<form:checkbox path="hobbies" value="travel" label="travel" />
				<form:checkbox path="hobbies" value="playing computer games"
					label="playing computer games" />
			</p>
			<p>
				<label>Gender: </label>
				<form:radiobutton path="gender" value="male" label="male" />
				<form:radiobutton path="gender" value="female" label="female" />
			</p>
			<p>
				<label for="email">Email: </label>
				<form:input id="email" name="email"
					path="userCommunicationDto.email" />
				<form:errors id="phone" name="phone"
					path="userCommunicationDto.email" class="error" />
			</p>
			<p>
				<label for="phone">Phone: </label>
				<form:input id="phone" name="phone"
					path="userCommunicationDto.phone" />
				<form:errors id="phone" name="phone"
					path="userCommunicationDto.phone" class="error" />
			</p>
			<p>
				<input type="submit" value="register">
			</p>
		</form:form>
	</div>
</body>
</html>