<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<div style='border:1px solid black'>
<form action='loginValidator'>
<h1>Login</h1>
User Name:<input type='text' id='username' name='username'> 
Password :<input type='text' id='password' name='password'>
<button type='submit'>Login</button>
</form>
<div style='color:red'>${errorMessage}</div>
</div>

</body>
</html>