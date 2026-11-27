package com.thinking.machines.service;
import java.sql.*;
public class LoginValidator
{
public static boolean validate(String userName,String password)
{
try
{
Connection connection=MyConnection.getConnection();
PreparedStatement prepareStatement=connection.prepareStatement("select * from login");
ResultSet resultSet=prepareStatement.executeQuery();
String dbUserName="";
String dbPassword="";
while(resultSet.next())
{
dbUserName=resultSet.getString("user_name");
dbPassword=resultSet.getString("password");
}
if(dbUserName.equals(userName) && dbPassword.equals(password)) return true;
}catch(Exception exception)
{
System.out.println(exception.getMessage());
}
return false;
}
}