import java.sql.*;
class DAOConnection
{
    private DAOConnection()
    {}
    public static Connection getConnection() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcemployee","root","123");
        return connection;
    }
}