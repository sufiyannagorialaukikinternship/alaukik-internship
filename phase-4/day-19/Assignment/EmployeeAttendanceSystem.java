import java.time.*;
import java.util.*;
class EmployeeAttendanceSystem
{
    private List<Employee> list=new ArrayList<>();
    private Map<Integer,Employee> map=new HashMap<>();
   
     EmployeeAttendanceSystem()
    {
        Employee e=new Employee();
        e.setEmployeeId(101);
        e.setName("Sufiyan Nagori");
        e.setDepartment("Computer Science");
        list.add(e);
        map.put(101,e);
         e=new Employee();
        e.setEmployeeId(102);
        e.setName("Mohammad Mushef");
        e.setDepartment("Computer Science");
        list.add(e);
                map.put(102,e);

 e=new Employee();
        e.setEmployeeId(103);
        e.setName("Ahemad bilal");
        e.setDepartment("AI/ML");
        list.add(e);
                map.put(103,e);

 e=new Employee();
        e.setEmployeeId(104);
        e.setName("Sumit Patel");
        e.setDepartment("Digital Marcketing");
        list.add(e);
                map.put(104,e);
 e=new Employee();
        e.setEmployeeId(105);
        e.setName("Aadarsh");
        e.setDepartment("AI/ML");
        list.add(e);
                map.put(105,e);
    }
    public void checkIn(int  employeeId)
    {
   Employee employee = map.get(employeeId);
   if(employee.getCheckInTime()!=null)
   {
    System.out.println("Check in time already available "+employee.getCheckInTime());
    return;
   }
employee.setCheckInTime(LocalTime.now());
System.out.println("Employee Check In Time added ");
    }
    
    public void checkOut(int  employeeId)
    {
   Employee employee = map.get(employeeId);
   if(employee.getCheckOutTime()!=null)
   {
    System.out.println("Check in out already available "+employee.getCheckOutTime());
    return;
   }
   if(employee.getCheckInTime()==null)
   {
    System.out.println("Check in time is not  available "+employee.getCheckInTime()+" Please enter check in time first");
    return;
   }
employee.setCheckOutTime(LocalTime.now());
System.out.println("Employee Check Out Time added ");
    }
    public void viewAttendance()
    {           
        for(Employee e : list)
        {
            if(e.getCheckInTime()==null) continue;

            System.out.println(e);
        }
    }
    public void viewAttendanceByEmployeeId(int employeeId)
    {
             Employee e=map.get(employeeId);
             if(e==null) 
    {
        System.out.println("Employee Id is not exists");
        return;
    }
             System.out.println(e);
        
    }
    public void showEmployee(int employeeId)
    {
     Employee e=map.get(employeeId);
     System.out.println("Employee Name :"+e.getName());
     System.out.println("Employee Deparment :"+e.getDepartment());
     }

}