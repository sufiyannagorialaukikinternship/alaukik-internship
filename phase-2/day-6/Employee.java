import java.util.*;
class Employee
{
 private int id;
 private String  name;
 private double salary;
 private String department;


Employee(){}
Employee(int id,String name, double salary,String department)
{
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.department=department;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}
public void displayDetails()
{
  System.out.println("Employee id :"+id);
  System.out.println("Employee name is :"+name);
  System.out.println("Employee Salary is :"+salary);
  System.out.println("Employee Department is :"+department);
}

    public static void main(String gg[])
    {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Employee Id :");int id=sc.nextInt();
System.out.print("Enter Employee name:");sc.nextLine();String name=sc.nextLine();
System.out.println("Enter Employee Salary:");double salary=sc.nextDouble();
System.out.println("Enter Employee Department:");sc.nextLine();String department=sc.nextLine();
Employee e=new Employee(id,name,salary,department);
e.displayDetails();
    }
}

