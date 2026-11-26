import java.util.*;
public class Employee
{
    private int employeeId;
    private String employeeName;
    private Date dob;
    private boolean isIndian;
    private double salary;
    
public Employee()
{
employeeId=0;
employeeName="";
dob=null;
isIndian=false;;
salary=0.00;
}


public int getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}

public String getEmployeeName() {
    return employeeName;
}

public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}

public Date getDob() {
    return dob;
}

public void setDob(Date dob) {
    this.dob = dob;
}

// Note: Standard convention for boolean getters uses "is" instead of "get"
public boolean isIndian() {
    return isIndian;
}

public void setIndian(boolean isIndian) {
    this.isIndian = isIndian;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public boolean equals(Object object)
{
    if(!(object instanceof Employee)) return false;
    Employee employee=(Employee) object;
    return employee.getEmployeeId()==this.employeeId;
}
public int hashCode()
{
    return employeeId;
}

}