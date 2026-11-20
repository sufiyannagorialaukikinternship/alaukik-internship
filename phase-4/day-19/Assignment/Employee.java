import java.time.*;
public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    // Getters and Setters

  public void setCheckInTime(LocalTime checkInTime)
{
    this.checkInTime=checkInTime;
}
  public void setCheckOutTime(LocalTime checkOutTime)
{
    this.checkOutTime=checkOutTime;
}


  public LocalTime getCheckInTime()
{
    return this.checkInTime;
}
  public LocalTime getCheckOutTime()
{
    return this.checkOutTime;
}
    public int getEmployeeId() {
        return employeeId;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getDepartment()
    {
        return this.department;
    }

    public void setEmployeeId(int employeeId ) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emdployee Id=" + employeeId +
                ", name='" + name + '\'' +
                ", department=" + department +
                                ", check In time=" + checkInTime +
                                                ", check out time =" + checkOutTime +
                '}';
    }
}
