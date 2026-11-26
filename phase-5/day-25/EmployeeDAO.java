
import java.sql.*;
import java.util.*;

public class EmployeeDAO
{
    public EmployeeDAO()
    {

    }

    // 1. ADD EMPLOYEE
    public void addEmployee(Employee employeeDTO) throws Exception
    {
        String employeeName=employeeDTO.getEmployeeName();
        java.util.Date dob=employeeDTO.getDob();
        boolean isIndian=employeeDTO.isIndian();
        double salary=employeeDTO.getSalary();

        if(dob==null) throw new Exception("DOB is required");
        if(salary<0) throw new Exception("Salary not be less than zero");

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "insert into employee (employee_name,dob,isIndian,salary) values(?,?,?,?)"
            );

            preparedStatement.setString(1,employeeName);
            preparedStatement.setDate(2,new java.sql.Date(dob.getTime()));
            preparedStatement.setBoolean(3,isIndian);
            preparedStatement.setDouble(4,salary);

            preparedStatement.executeUpdate();

            System.out.println("Employee added..");

            preparedStatement.close();
            connection.close();

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    // 2. UPDATE EMPLOYEE
    public void updateEmployee(Employee employeeDTO) throws Exception
    {
        int employeeId=employeeDTO.getEmployeeId();
        String employeeName=employeeDTO.getEmployeeName();
        java.util.Date dob=employeeDTO.getDob();
        boolean isIndian=employeeDTO.isIndian();
        double salary=employeeDTO.getSalary();

        if(employeeId==0) throw new Exception("Employee Id can't be zero");
        if(dob==null) throw new Exception("DOB is required");
        if(salary<0) throw new Exception("Salary not be less than zero");

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "update employee set employee_name=?,dob=?,isIndian=?,salary=? where employee_id=?"
            );

            preparedStatement.setString(1,employeeName);
            preparedStatement.setDate(2,new java.sql.Date(dob.getTime()));
            preparedStatement.setBoolean(3,isIndian);
            preparedStatement.setDouble(4,salary);
            preparedStatement.setInt(5,employeeId);

            int rows=preparedStatement.executeUpdate();

            if(rows==0)
                throw new Exception("Employee not found with ID : "+employeeId);

            System.out.println("Employee Updated..");

            preparedStatement.close();
            connection.close();

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    // 3. REMOVE EMPLOYEE
    public void removeEmployee(int employeeId) throws Exception
    {
        if(employeeId==0)
            throw new Exception("Employee Id can't be zero");

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "delete from employee where employee_id=?"
            );

            preparedStatement.setInt(1,employeeId);

            int rows=preparedStatement.executeUpdate();

            if(rows==0)
                throw new Exception("Employee not found with ID : "+employeeId);

            System.out.println("Employee removed..");

            preparedStatement.close();
            connection.close();

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    // 4. GET ALL EMPLOYEES
    public List<Employee> getAllEmployee() throws Exception
    {
        List<Employee> employeeList=new LinkedList<>();

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "select * from employee"
            );

            ResultSet resultSet=preparedStatement.executeQuery();

            Employee employeeDTO=null;

            while(resultSet.next())
            {
                employeeDTO=new Employee();

                employeeDTO.setEmployeeId(resultSet.getInt("employee_id"));
                employeeDTO.setEmployeeName(resultSet.getString("employee_name"));
                employeeDTO.setDob(resultSet.getDate("dob"));
                employeeDTO.setIndian(resultSet.getBoolean("isIndian"));
                employeeDTO.setSalary(resultSet.getDouble("salary"));

                employeeList.add(employeeDTO);
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

            return employeeList;

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    // 5. GET EMPLOYEE BY ID
    public Employee getByEmployeeId(String employeeId) throws Exception
    {
        if(employeeId==null)
            throw new Exception("Employee ID is null");

        employeeId=employeeId.trim();

        if(employeeId.length()==0)
            throw new Exception("Employee ID is required");

        int id;

        try
        {
            id=Integer.parseInt(employeeId);
        }
        catch(NumberFormatException e)
        {
            throw new Exception("Invalid Employee ID");
        }

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "select * from employee where employee_id=?"
            );

            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();

            Employee employeeDTO=null;

            if(resultSet.next())
            {
                employeeDTO=new Employee();

                employeeDTO.setEmployeeId(resultSet.getInt("employee_id"));
                employeeDTO.setEmployeeName(resultSet.getString("employee_name"));
                employeeDTO.setDob(resultSet.getDate("dob"));
                employeeDTO.setIndian(resultSet.getBoolean("isIndian"));
                employeeDTO.setSalary(resultSet.getDouble("salary"));
            }

            resultSet.close();
            preparedStatement.close();
            connection.close();

            return employeeDTO;

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    // 6. CHECK EMPLOYEE ID EXISTS
    public boolean isEmployeeIdExists(String employeeId) throws Exception
    {
        if(employeeId==null)
            throw new Exception("Employee ID is null");

        employeeId=employeeId.trim();

        if(employeeId.length()==0)
            throw new Exception("Employee ID is required");

        int id;

        try
        {
            id=Integer.parseInt(employeeId);
        }
        catch(NumberFormatException e)
        {
            throw new Exception("Invalid Employee ID");
        }

        try
        {
            Connection connection=DAOConnection.getConnection();

            PreparedStatement preparedStatement=connection.prepareStatement(
                "select employee_id from employee where employee_id=?"
            );

            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();

            boolean exists=resultSet.next();

            resultSet.close();
            preparedStatement.close();
            connection.close();

            return exists;

        }
        catch(Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

}
