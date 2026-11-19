import java.util.*;
import java.util.function.*;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String aadharNumber;
    private String department;
    // Getters and Setters

    public int getId() {
        return id;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getDepartment()
    {
        return this.department;
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

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
