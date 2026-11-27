<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Page Title</title>
</head>
<body>

    <h1>Welcome to Access Page</h1>

    <%-- JSP Comment (Browser mein nahi dikhega) --%>
    <%
        // Java Scriptlet code yahan likhein
        String message = "Welcome to my Application, Your username & Password is correct!";
    %>

    <p><%= message %></p>

</body>
</html>
