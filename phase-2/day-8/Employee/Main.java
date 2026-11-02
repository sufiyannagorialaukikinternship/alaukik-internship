public class Main
{
    public static void main(String gg[])
    {
        Employee e=new SeniorDeveloper();
          e.setEmployeeId(100);
          e.setEmployeeName("Sufiyan nagori");
          e.setDesignation("Software architechture");
          e.setSalary(100000.0);
          e.setIndian(true);
          e.setMobileNumber("9425418078");
          e.setAadharCardNumber("729273106789");
          e.setPanCardNumber("DEMP2888H");
System.out.println("*****************Senior Developer is******************");
          System.out.println("Employee Id is :"+e.getEmployeeId());
          System.out.println("Employee Name is :"+e.getEmployeeName());
          System.out.println("Designation is :"+e.getDesignation());
          System.out.println("Salary is :"+e.getSalary());
          System.out.println("Is Indian :"+e.isIndian());
          System.out.println("Mobile Number :"+e.getMobileNumber());

          System.out.println("Aadhar Card Number:"+e.getAadharCardNumber());
          System.out.println("Pan card Number is :"+e.getPanCardNumber());        
System.out.println("---------------------------------------------------------");



        Employee e1=new Developer();
          e1.setEmployeeId(101);
          e1.setEmployeeName("Mohammad mushef");
          e1.setDesignation("java full stack developer");
          e1.setSalary(100000.0);
          e1.setIndian(true);
          e1.setMobileNumber("9424721818");
          e1.setAadharCardNumber("724545354353");
          e1.setPanCardNumber("DEMP285233");
System.out.println("*****************Developer is******************");
          System.out.println("Employee Id is :"+e1.getEmployeeId());
          System.out.println("Employee Name is :"+e1.getEmployeeName());
          System.out.println("Designation is :"+e1.getDesignation());
          System.out.println("Salary is :"+e1.getSalary());
          System.out.println("Is Indian :"+e1.isIndian());
          System.out.println("Mobile Number :"+e1.getMobileNumber());

          System.out.println("Aadhar Card Number:"+e1.getAadharCardNumber());
          System.out.println("Pan card Number is :"+e1.getPanCardNumber());        
System.out.println("---------------------------------------------------------");



    }
}