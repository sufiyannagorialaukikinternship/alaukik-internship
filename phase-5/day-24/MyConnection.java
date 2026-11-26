import java.sql.*;
class MyConnection
{
    private MyConnection(){}
    public static Connection getConnection() throws Exception
    {
        Connection connection=null;
        
           Class.forName("com.mysql.cj.jdbc.Driver");
           connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","123");
        

                   return connection;
    } 
}