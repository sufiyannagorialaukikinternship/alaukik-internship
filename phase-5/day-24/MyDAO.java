import java.sql.*;
class MyDAO
{
    public void getEmployee()
    {
        Connection connection =null;
        PreparedStatement prepareStatement=null;
        ResultSet resultSet=null;
        try
        {
            connection=MyConnection.getConnection();
            prepareStatement=connection.prepareStatement("select * from employees");
            resultSet=prepareStatement.executeQuery();
            while(resultSet.next())
            {
                int employeeId=resultSet.getInt("employee_id");
                String name=resultSet.getString("name");
                int depId=resultSet.getInt("dep_id");
                int roleId=resultSet.getInt("role_id");
                System.out.println("Employee Id is :"+employeeId);
                System.out.println("Employee Name is :"+name);
                System.out.println("Dep id is :"+depId);
                System.out.println("Role Id is :"+roleId);
                System.out.println("---------------------------------------");
            }
        }catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
    public static void main(String gg[])
    {
MyDAO m=new MyDAO();
m.getEmployee();
    }
}
