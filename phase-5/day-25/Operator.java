
import java.util.*;
import java.io.*;

     class Main
{
    public static void main(String gg[])
    {
        int employeeId;
        String employeeName;
        Date dob;
        boolean isIndian;
        double salary;

        Employee employee=null;
        EmployeeDAO employeeDAO=new EmployeeDAO();

        while(true)
        {
            System.out.println("1. Add New Employee :");
            System.out.println("2. Update Employee :");
            System.out.println("3. Remove Employee :");
            System.out.println("4. Show All Employees :");
            System.out.println("5. Search Employee :");
            System.out.print("Choose operation from 1 to 5 :");

            try
            {
                InputStreamReader inputStreamReader=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(inputStreamReader);

                int num=Integer.parseInt(br.readLine());

                if(num==1)
                {
                    System.out.print("Enter Employee Name :");
                    employeeName=br.readLine();

                    System.out.print("Enter Date of Birth (yyyy-mm-dd) :");
                    String date=br.readLine();
                    dob=java.sql.Date.valueOf(date);

                    System.out.print("Is Employee Indian (true/false) :");
                    isIndian=Boolean.parseBoolean(br.readLine());

                    System.out.print("Enter Employee Salary :");
                    salary=Double.parseDouble(br.readLine());

                    employee=new Employee();
                    employee.setEmployeeName(employeeName);
                    employee.setDob(dob);
                    employee.setIndian(isIndian);
                    employee.setSalary(salary);

                    employeeDAO.addEmployee(employee);
                }
                else if(num==2)
                {
                    System.out.print("Enter Employee ID :");
                    employeeId=Integer.parseInt(br.readLine());

                    System.out.print("Enter Employee Name :");
                    employeeName=br.readLine();

                    System.out.print("Enter Date of Birth (yyyy-mm-dd) :");
                    String date=br.readLine();
                    dob=java.sql.Date.valueOf(date);

                    System.out.print("Is Employee Indian (true/false) :");
                    isIndian=Boolean.parseBoolean(br.readLine());

                    System.out.print("Enter Employee Salary :");
                    salary=Double.parseDouble(br.readLine());

                    employee=new Employee();
                    employee.setEmployeeId(employeeId);
                    employee.setEmployeeName(employeeName);
                    employee.setDob(dob);
                    employee.setIndian(isIndian);
                    employee.setSalary(salary);

                    employeeDAO.updateEmployee(employee);
                }
                else if(num==3)
                {
                    System.out.print("Enter Employee ID :");
                    employeeId=Integer.parseInt(br.readLine());

                    employeeDAO.removeEmployee(employeeId);
                }
                else if(num==4)
                {
                    List<Employee> employeeList=employeeDAO.getAllEmployee();

                    System.out.println("***********************************************");
                    System.out.println("Employee ID | Employee Name | DOB | Indian | Salary");

                    employeeList.forEach((e)->{
                        System.out.println(
                            e.getEmployeeId()+" | "+
                            e.getEmployeeName()+" | "+
                            e.getDob()+" | "+
                            e.isIndian()+" | "+
                            e.getSalary()
                        );
                    });

                    System.out.println("************* Employee List Ends *************");
                }
                else if(num==5)
                {
                    System.out.print("Enter Employee ID :");
                    employeeId=Integer.parseInt(br.readLine());

                    employee=employeeDAO.getByEmployeeId(String.valueOf(employeeId));

                    if(employee==null) continue;

                    System.out.println("**************************************");
                    System.out.println("Employee ID | Employee Name | DOB | Indian | Salary");

                    System.out.println(
                        employee.getEmployeeId()+" | "+
                        employee.getEmployeeName()+" | "+
                        employee.getDob()+" | "+
                        employee.isIndian()+" | "+
                        employee.getSalary()
                    );

                    System.out.println("**************************************");
                }
                else
                {
                    System.out.println("Please Choose Valid Operation 1-5");
                }

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
