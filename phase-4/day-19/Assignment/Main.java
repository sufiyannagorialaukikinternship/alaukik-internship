import java.util.*;
import java.io.*;
import java.time.*;

class Main
{
    public static void main(String gg[])
    {
    int employeeId=0;
        try
        {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
EmployeeAttendanceSystem employeeAs=new EmployeeAttendanceSystem();
      int num=0;
        while(true)
        {
            System.out.println("1.Check In :");
            System.out.println("2.Check out :");
            System.out.println("3.View Employee Attendence :");
            System.out.println("4.View Attendence by employee id :");
            System.out.println("5.Exit :");
            try
            {
            num=Integer.parseInt(bufferedReader.readLine());
            if(num==1)
            {
                System.out.println("Enter Employee Id :");
                 employeeId=Integer.parseInt(bufferedReader.readLine());
                  employeeAs.showEmployee(employeeId);
                employeeAs.checkIn(employeeId);               
            }
            else if(num==2)
            {
                System.out.print("Enter Employee Id :");
                employeeId=Integer.parseInt(bufferedReader.readLine());
                  employeeAs.showEmployee(employeeId);
                employeeAs.checkOut(employeeId);               
                
            }else if(num==3)
            {
                employeeAs.viewAttendance();
            }
            else if(num==4)
            {
                System.out.print("Enter Employee Id :");
                employeeId=Integer.parseInt(bufferedReader.readLine());
                employeeAs.viewAttendanceByEmployeeId(employeeId);

            }else if(num==5)
            {
                    System.out.println("Bye....");
                break;
            
            }
            else 
            {
                System.out.println("Please Enter a valid Number from 1-4 ");
            }

            }catch(NumberFormatException nfe)
            {
                System.out.println("Please Enter Valid number");
            }
                
        }
        }catch(Exception e)
        {}
    }
}