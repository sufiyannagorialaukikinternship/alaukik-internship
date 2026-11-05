package com.company.employee.service;
import com.company.employee.model.*;
import java.util.*;
public class EmployeeService
{
private List<EmployeeModel> employeeList=null;
private Map<String,EmployeeModel> employeeIdWiseEmployeeMap=null;
private Map<String,EmployeeModel> aadharNumberWiseEmployeeMap=null;
private Map<String,EmployeeModel> panNumberWiseEmployeeMap=null;
private static EmployeeService employeeService=null;

public EmployeeService()
{
 employeeList=new LinkedList<>();
employeeIdWiseEmployeeMap=new LinkedHashMap();
 aadharNumberWiseEmployeeMap=new LinkedHashMap();
 panNumberWiseEmployeeMap=new LinkedHashMap();
}
    public void addEmployee(EmployeeModel employee) throws Exception
    {
        String employeeId=employee.getEmployeeId();
        String employeeName=employee.getEmployeeName();
        Date dob=employee.getDob();
        boolean isIndian=employee.isIndian();
        double salary=employee.getSalary();
        char gender=employee.getGender();
        String aadharNumber=employee.getAadharNumber();
        String panNumber=employee.getPanNumber();
       if(employeeId==null) throw new Exception("Employee Id can't be null");
       employeeId=employeeId.trim();
       if(employeeId.length()==0) throw new Exception("Employee Id required");
       if(dob==null)throw new Exception("dob is required");
        if(salary<0) throw new Exception("Salary not be less than zero");
        if(gender!='m' && gender!='f' && gender!='M' && gender!='F') throw new Exception("Gender must be M or F not something else");
        if(aadharNumber==null) throw new Exception("Aadhar Number Id can't be null");
        aadharNumber=aadharNumber.trim();
        if(aadharNumber.length()==0) throw new Exception("Aadhar Number is required");
        if(panNumber==null) throw new Exception("pan Number Id can't be null");
        panNumber=panNumber.trim();
        if(panNumber.length()==0) throw new Exception("pan Number is required");
        try
        {
     
     EmployeeModel employeeModel=new EmployeeModel();
     employeeModel.setEmployeeId(employeeId);
     employeeModel.setEmployeeName(employeeName);
     employeeModel.setDob(dob);
     employeeModel.setSalary(salary);
     employeeModel.setGender(gender);
     employeeModel.setAadharNumber(aadharNumber);
     employeeModel.setPanNumber(panNumber);


if(employeeIdWiseEmployeeMap.containsKey(employeeId)) throw new Exception("Employee id already exists :"+employeeId);
if(aadharNumberWiseEmployeeMap.containsKey(aadharNumber))throw new Exception("Aadhar Number already exists :"+aadharNumber);
if(panNumberWiseEmployeeMap.containsKey(panNumber))throw new Exception("pan Number already exists :"+panNumber);

 employeeList.add(employeeModel);
 employeeIdWiseEmployeeMap.put(employeeId,employeeModel);
 aadharNumberWiseEmployeeMap.put(aadharNumber,employeeModel);
 panNumberWiseEmployeeMap.put(panNumber,employeeModel);

System.out.println("Employee is Added..");
        }catch(Exception e)
        {
              throw new Exception(e.getMessage());
        }
    }
    public void updateEmployee(EmployeeModel employee) throws Exception
    {
        String employeeId=employee.getEmployeeId();
        String employeeName=employee.getEmployeeName();
        Date dob=employee.getDob();
        boolean isIndian=employee.isIndian();
        double salary=employee.getSalary();
        char gender=employee.getGender();
        String aadharNumber=employee.getAadharNumber();
        String panNumber=employee.getPanNumber();
       if(employeeId==null) throw new Exception("Employee Id can't be null");
       employeeId=employeeId.trim();
       if(employeeId.length()==0) throw new Exception("Employee Id required");
       if(dob==null)throw new Exception("dob is required");
        if(salary<0) throw new Exception("Salary not be less than zero");
        if(gender!='m' && gender!='f' && gender!='M' && gender!='F') throw new Exception("Gender must be M or F not something else");
        if(aadharNumber==null) throw new Exception("Aadhar Number Id can't be null");
        aadharNumber=aadharNumber.trim();
        if(aadharNumber.length()==0) throw new Exception("Aadhar Number is required");
        if(panNumber==null) throw new Exception("pan Number Id can't be null");
        panNumber=panNumber.trim();
        if(panNumber.length()==0) throw new Exception("pan Number is required");
        try
        {
     
     EmployeeModel employeeModel=new EmployeeModel();
     employeeModel.setEmployeeId(employeeId);
     employeeModel.setEmployeeName(employeeName);
     employeeModel.setDob(dob);
     employeeModel.setSalary(salary);
     employeeModel.setGender(gender);
     employeeModel.setAadharNumber(aadharNumber);
     employeeModel.setPanNumber(panNumber);


if(employeeIdWiseEmployeeMap.containsKey(employeeId)==false) throw new Exception("Employee id not Exists, please give valid employee Id :"+employeeId);
if(aadharNumberWiseEmployeeMap.containsKey(aadharNumber) && aadharNumberWiseEmployeeMap.get(aadharNumber).getEmployeeId()!=employeeId)throw new Exception("Aadhar Number already exists :"+aadharNumber);
if(panNumberWiseEmployeeMap.containsKey(panNumber) && panNumberWiseEmployeeMap.get(panNumber).getEmployeeId()!=employeeId)throw new Exception("pan Number already exists :"+panNumber);

 employeeList.remove(employeeModel);
 employeeIdWiseEmployeeMap.remove(employeeId);
 aadharNumberWiseEmployeeMap.remove(aadharNumber);
 panNumberWiseEmployeeMap.remove(panNumber);



 employeeList.add(employeeModel);
 employeeIdWiseEmployeeMap.put(employeeId,employeeModel);
 aadharNumberWiseEmployeeMap.put(aadharNumber,employeeModel);
 panNumberWiseEmployeeMap.put(panNumber,employeeModel);

System.out.println("Employee is Updated..");
        }catch(Exception e)
        {
              throw new Exception(e.getMessage());
        }

    }
    public void removeEmployee(String employeeId) throws Exception
    {
        if(employeeId==null)throw new Exception("EmployeeId is null");
        employeeId=employeeId.trim();
        if(employeeId.length()==0) throw new Exception("Employee Id required");
if(employeeIdWiseEmployeeMap.containsKey(employeeId)==false) throw new Exception("Employee id not Exists, please give valid employee Id :"+employeeId);
 EmployeeModel employeeModel=employeeIdWiseEmployeeMap.get(employeeId);
 employeeList.remove(employeeModel);
 employeeIdWiseEmployeeMap.remove(employeeModel.getEmployeeId());
 aadharNumberWiseEmployeeMap.remove(employeeModel.getAadharNumber());
 panNumberWiseEmployeeMap.remove(employeeModel.getPanNumber());
 System.out.println("Employee removed..");
    }
    public List<EmployeeModel> getAllEmployee() throws Exception
    {       
        List<EmployeeModel> employeeModelList=new LinkedList<>();
        EmployeeModel employeeModel=null; 
        for(EmployeeModel employee:employeeList)
        {
            employeeModel=new EmployeeModel();
            employeeModel.setEmployeeId(employee.getEmployeeId());
            employeeModel.setEmployeeName(employee.getEmployeeName());
            employeeModel.setDob(employee.getDob());
            employeeModel.setIndian(employee.isIndian());
            employeeModel.setSalary(employee.getSalary());
            employeeModel.setGender(employee.getGender());
            employeeModel.setAadharNumber(employee.getAadharNumber());
            employeeModel.setPanNumber(employee.getPanNumber());
            employeeModelList.add(employeeModel);
        }
        return employeeModelList;
    }
    public EmployeeModel getByEmployeeId(String employeeId) throws Exception
    {
              if(employeeId==null)throw new Exception("EmployeeId is null");
        employeeId=employeeId.trim();
        if(employeeId.length()==0) throw new Exception("Employee Id required");
EmployeeModel employee=employeeIdWiseEmployeeMap.get(employeeId);
            EmployeeModel employeeModel=new EmployeeModel();
            employeeModel.setEmployeeId(employee.getEmployeeId());
            employeeModel.setEmployeeName(employee.getEmployeeName());
            employeeModel.setDob(employee.getDob());
            employeeModel.setIndian(employee.isIndian());
            employeeModel.setSalary(employee.getSalary());
            employeeModel.setGender(employee.getGender());
            employeeModel.setAadharNumber(employee.getAadharNumber());
            employeeModel.setPanNumber(employee.getPanNumber());
 return employeeModel;
    }
    public boolean isEmployeeIdExists(String employeeId) throws Exception
    {
              if(employeeId==null)throw new Exception("EmployeeId is null");
        employeeId=employeeId.trim();
        if(employeeId.length()==0) throw new Exception("Employee Id required");
                 return employeeIdWiseEmployeeMap.containsKey(employeeId);
    }
       public EmployeeModel getByEmployeeAadharNumber(String aadharNumber) throws Exception
    {
                throw new Exception("Not yet implemented");
    }
    public boolean isAadharNumberExists(String employeeId) throws Exception
    {
                throw new Exception("Not yet implemented");
    }
       public EmployeeModel  getByPanNumber(String panNumber) throws Exception
    {
                throw new Exception("Not yet implemented");
    }
    public boolean isPanNumberExists(String panNumber) throws Exception
    {
                throw new Exception("Not yet implemented");
    }
}