import com.company.employee.model.*;
import com.company.employee.service.*;
import com.company.employee.util.*;
import java.io.*;
import java.util.*;
public class Main
{    
public static void main(String gg[])
{

     String employeeId="";
     String employeeName="";

     Date dob=null;

     boolean isIndian=false;

     double salary=0;
     char gender=' ';
     String aadharNumber="";
     String panNumber="";

     Scanner sc=new Scanner(System.in);

BufferedReader br=null;
EmployeeService employeeService=new EmployeeService();
    while(true)
    {
        System.out.println("1.Insert new Employee.");
        System.out.println("2.Update Employee.");
        System.out.println("3.Remove Employee.");
        System.out.println("4.Show All Employee.");
        System.out.println("5.Get Employee By EmployeeId.");
        System.out.println("6.Check is EmployeeId Exists.");

        System.out.println("7.Get Employee By Aadhar Nubmer.");
        System.out.println("8.Check is Aadhar Number Exists.");

        System.out.println("9.Get Employee By Pan Number.");
        System.out.println("10.Check is Pan Number Exists.");
        System.out.println("11.Exist.");
     System.out.print("Choose option from 1-11 to operate :");
int num=sc.nextInt();
try
{
    br=new BufferedReader(new InputStreamReader(System.in));
if(num==1)
{
  System.out.print("Enter Employee Id :");
   employeeId=br.readLine();
  System.out.print("Enter Employee Name :");
   employeeName=br.readLine();

  System.out.print("Enter Employee Date of birth :");
   String stringDob=br.readLine();
   dob = Converter.stringToDateConverter(stringDob);

   
   System.out.print("Are Employee indian Y/N :");
   
   char tmp=br.readLine().charAt(0);
   if(tmp=='Y' || tmp=='y') isIndian=true;
   else isIndian=false;

  System.out.print("Enter Employee Salary :");
   salary=Double.parseDouble(br.readLine());



  System.out.print("Enter Employee gender M/F :");

   tmp=br.readLine().charAt(0);
gender=tmp;

  System.out.print("Enter Employee Aadhar Number :");
   aadharNumber=br.readLine();



  System.out.print("Enter Employee Pan Number :");
   panNumber=br.readLine();;



     
     EmployeeModel employeeModel=new EmployeeModel();
     employeeModel.setEmployeeId(employeeId);
     employeeModel.setEmployeeName(employeeName);
     employeeModel.setDob(dob);
     employeeModel.setSalary(salary);
     employeeModel.setGender(gender);
     employeeModel.setAadharNumber(aadharNumber);
     employeeModel.setPanNumber(panNumber);
employeeService.addEmployee(employeeModel);

}else if(num==2)
{
      System.out.print("Enter Employee Id :");
   employeeId=br.readLine();
  System.out.print("Enter Employee Name :");
   employeeName=br.readLine();

  System.out.print("Enter Employee Date of birth :");
   String stringDob=br.readLine();
   dob = Converter.stringToDateConverter(stringDob);

   
   System.out.print("Are Employee indian Y/N :");
   
   char tmp=br.readLine().charAt(0);
   if(tmp=='Y' || tmp=='y') isIndian=true;
   else isIndian=false;

  System.out.print("Enter Employee Salary :");
   salary=Double.parseDouble(br.readLine());



  System.out.print("Enter Employee gender M/F :");

   tmp=br.readLine().charAt(0);
gender=tmp;

  System.out.print("Enter Employee Aadhar Number :");
   aadharNumber=br.readLine();



  System.out.print("Enter Employee Pan Number :");
   panNumber=br.readLine();;



     
     EmployeeModel employeeModel=new EmployeeModel();
     employeeModel.setEmployeeId(employeeId);
     employeeModel.setEmployeeName(employeeName);
     employeeModel.setDob(dob);
     employeeModel.setSalary(salary);
     employeeModel.setGender(gender);
     employeeModel.setAadharNumber(aadharNumber);
     employeeModel.setPanNumber(panNumber);
     employeeService.updateEmployee(employeeModel);

}else if(num==3)
{
      System.out.print("Enter Employee Id :");
   employeeId=br.readLine();
   employeeService.removeEmployee(employeeId);
}else if(num==4)
{
    List<EmployeeModel> employeeList=employeeService.getAllEmployee();
    System.out.println("**************Employee Details***************");
    if(employeeList.size()==0)
    {
         System.out.println("No Employee Data is availabe");
        System.out.println("______________________________________________");
}
    employeeList.forEach((emp)->{

        System.out.println("Employee Id :"+emp.getEmployeeId());
        System.out.println("Employee Name :"+emp.getEmployeeName());
        System.out.println("Date of birth :"+emp.getDob());
        System.out.println("Is Indian :"+emp.isIndian());
        System.out.println("Employee Salary :"+emp.getSalary());
        System.out.println("Gender :"+emp.getGender());
        System.out.println("Aadhar Number :"+emp.getAadharNumber());
        System.out.println("Pan Number :"+emp.getPanNumber());
        System.out.println("______________________________________________");
    });
}else if(num==5)
{}else if(num==6)
{}else if(num==7)
{}else if(num==8)
{}else if(num==9)
{}else if(num==10)
{}else if(num==11)
{
    break;
}

}catch(Exception e)
{
    e.printStackTrace();
    System.out.println(e.getMessage());
}
    }
}
}