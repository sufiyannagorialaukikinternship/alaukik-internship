import java.util.stream.*;
import java.util.*;
class EmployeeAs
{
    private List<Employee> list=new ArrayList<>();
    
    public void setData() 
    {


        Employee e = new Employee();

        e.setId(101);
        e.setName("Sufiyan Nagori");
        e.setSalary(600000);
        e.setDepartment("Software developement");
        e.setAadharNumber("7393483834");

        list.add(e);


        e = new Employee();

        e.setId(102);
        e.setName("Sumit Patel");
        e.setSalary(50000);
        e.setDepartment("Software developement");
        e.setAadharNumber("7395453483834");

        list.add(e);



        e = new Employee();

        e.setId(103);
        e.setName("Mohammad Mushef");
        e.setSalary(670000);
        e.setDepartment("Artificial intelligence");
        e.setAadharNumber("73934833453");

        list.add(e);


        e = new Employee();

        e.setId(104);
        e.setName("Ahemad Bilal");
        e.setSalary(40000);
        e.setDepartment("Artifical Intelligence");
        e.setAadharNumber("7393483834");

        list.add(e);



        e = new Employee();

        e.setId(105);
        e.setName("Suresh");
        e.setSalary(95000);
        e.setDepartment("Graphic designing");
        e.setAadharNumber("739353483834");

        list.add(e);



        e = new Employee();

        e.setId(106);
        e.setName("Aakash");
        e.setSalary(30000);
        e.setDepartment("Graphic designing");
        e.setAadharNumber("739348386334");

        list.add(e);

    }
 
 public void filter()
 {
    List<Employee> filterList=list.stream().filter(item->item.getSalary()>50000.0).collect(Collectors.toList());

    System.out.println("Employee with salary > 50000 is ");
    filterList.stream().forEach(item->System.out.println(item.getId()+", "+item.getName()+", "+item.getSalary()+", "+item.getDepartment()+", "+item.getAadharNumber()));
 }
 public void highestSalary()
 {
    System.out.println("\n\n\n\n\n");
    Employee highestSalary=list.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).orElse(null);
    if(highestSalary!=null)
    {
        System.out.println("higest Salary Employee is "+highestSalary.getName());
        System.out.println("id "+highestSalary.getId());
        System.out.println("Salary :"+highestSalary.getSalary());
        System.out.println("Department :"+highestSalary.getDepartment());
        System.out.println("Aadhar Number :"+highestSalary.getAadharNumber());
    }
 }

 
 public void averageSalary()
 {
    System.out.println("\n\n\n\n\n");
double avgSalary = list.stream()
    .mapToDouble(Employee::getSalary)
    .average()
    .orElse(0.0);

System.out.println("Average Salary: " + avgSalary);

List<Employee> averageEmployees = list.stream()
    .filter(e -> e.getSalary() == avgSalary)
    .collect(Collectors.toList());

averageEmployees.forEach(e ->
    System.out.println(e.getName() + " - " + e.getSalary())
);
 }
 public void groupByDepartment()
 {
    System.out.println("\n\n\n\n\n");
    Map<String,List<Employee>> groupByDepartment=list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
System.out.println("Employees group by department");
groupByDepartment.forEach((e,j)->{
List<Employee> departmentList=groupByDepartment.get(e);
System.out.println("*****************************************************");
departmentList.forEach((item)->{
System.out.println(item.getId()+", "+item.getName()+", "+item.getSalary()+", "+item.getDepartment()+", "+item.getAadharNumber());    
System.out.println("-------------------------------------------------------");
});
System.out.println("******************************************************\n\n\n");

});
 }
    public static void main(String gg[])
    {
     EmployeeAs eAs=new EmployeeAs();
     eAs.setData();
        
    eAs.filter();
    eAs.highestSalary();
    eAs.groupByDepartment();
    eAs.averageSalary();
    }
}