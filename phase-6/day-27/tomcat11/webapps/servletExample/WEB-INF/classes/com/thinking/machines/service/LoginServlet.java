package com.thinking.machines.service;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class LoginServlet extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
String userName="";
String password="";
try
{
userName=(String)request.getParameter("username");
password=(String)request.getParameter("password");

System.out.println("user name is :"+userName);
System.out.println("Password is :"+password);
boolean isValidate=LoginValidator.validate(userName,password);
System.out.println("Is Validate :"+isValidate);
if(isValidate)
{
request.getRequestDispatcher("Access.jsp").forward(request,response);
}
else
{
request.setAttribute("errorMessage","Invalid username/password");
request.getRequestDispatcher("index.jsp").forward(request,response);
}

}catch(Exception exception)
{
System.out.println(exception.getMessage());
}
}
}