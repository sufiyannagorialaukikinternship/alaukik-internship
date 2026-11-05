package com.company.employee.model;
import java.util.*;
public class EmployeeModel
{
    private String employeeId;
    private String employeeName;
    private Date dob;
    private boolean isIndian;
    private double salary;
    private char gender;
    private String aadharNumber;
        private String panNumber;

public EmployeeModel()
{
employeeId="";
employeeName="";
dob=null;
isIndian=false;;
salary=0.00;
aadharNumber="";
panNumber="";
}

public void setGender(char gender)
{
    this.gender=gender;
}
public char getGender()
{
    return this.gender;
}
public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
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

public String getAadharNumber() {
    return aadharNumber;
}

public void setAadharNumber(String aadharNumber) {
    this.aadharNumber = aadharNumber;
}

public String getPanNumber() {
    return panNumber;
}

public void setPanNumber(String panNumber) {
    this.panNumber = panNumber;
}
public int hashCode()
{
    return employeeId.hashCode();
}

}