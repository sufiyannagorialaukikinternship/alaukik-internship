package com.thinking.machines.service;
import java.sql.*;
public class MyConnection
{
public MyConnection()
{}
public static Connection getConnection() throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","123");
return connection;
}
}