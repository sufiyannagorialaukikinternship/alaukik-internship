import java.util.*;
class Bank
{
private List<Customer> customerList;
private Map<String,Customer> accountNumberWiseCustomer;
Bank()
{
    this.customerList=new LinkedList<>();
    this.accountNumberWiseCustomer=new HashMap<>();
}
  public void add(Customer customer) throws Exception
  {
    String accountNumber=customer.getAccountNumber();
      if(accountNumberWiseCustomer.containsKey(accountNumber)) 
      {
 throw new Exception("Customer already exists with account number :"+accountNumber);
      }
      System.out.println(customer.getAccountNumber());
      System.out.println(customer.getAccountType());
      customerList.add(customer);
      accountNumberWiseCustomer.put(accountNumber,customer);
  }

public void delete(String accountNumber) throws Exception
{
    if(accountNumberWiseCustomer.containsKey(accountNumber)==false) 
    {
throw new Exception("Customer not exists with account number "+accountNumber+" please write valid account number");
    }
    
    
Customer c=  accountNumberWiseCustomer.get(accountNumber);
    System.out.println("Account Name: "+c.getAccountName());
    System.out.println("Account Number :"+c.getAccountNumber());
    System.out.println("Account Type :"+c.getAccountType());
    System.out.println("Available Balance :"+c.getBalance());

System.out.println("Are you sure, you want to delete (Y/N) ");
Scanner sc=new Scanner(System.in);
char isDelete=sc.nextLine().charAt(0);
if(isDelete=='y' || isDelete=='Y') 
{
    customerList.remove(c);
    accountNumberWiseCustomer.remove(accountNumber);
    System.out.println("Customer removed");    
}
}
  public void update(Customer customer) throws Exception
{
    if(accountNumberWiseCustomer.containsKey(customer.getAccountNumber())==false) 
    {
        throw new AccountNotFoundException("Customer not exists with account number "+customer.getAccountNumber()+" please write valid account number");
    }

    System.out.println("Account Name: "+customer.getAccountName());
    System.out.println("Account Number :"+customer.getAccountNumber());
    System.out.println("Account Type :"+customer.getAccountType());
    System.out.println("Available Balance :"+customer.getBalance());

System.out.println("Are you sure, you want to update (Y/N) ");
Scanner sc=new Scanner(System.in);
char isDelete=sc.nextLine().charAt(0);
if(isDelete=='y' || isDelete=='Y') 
{
    customerList.remove(customer);
    accountNumberWiseCustomer.remove(customer.getAccountNumber());

    customerList.add(customer);
    accountNumberWiseCustomer.put(customer.getAccountNumber(),customer);
    System.out.println("Customer updated");    
}


}
public List<Customer> getAllCustomers()
{
    Customer customer=null;
    List<Customer> list=new LinkedList<>();
 for(Customer c:customerList)
 {
    customer=new Customer();
    customer.setAccountName(c.getAccountName());
    customer.setAccountNumber(c.getAccountNumber());
    customer.setAccountType(c.getAccountType());
    customer.setBalance(c.getBalance());
    list.add(customer);
 }   
 return list;
}


public void withdraw(String accountNumber,double withdrawAmount) throws Exception
{
    if(!accountNumberWiseCustomer.containsKey(accountNumber))
    {
        throw new AccountNotFoundException("Invalid Account Number please enter valid account Number ");
    }
   
   Customer c= accountNumberWiseCustomer.get(accountNumber);
   if(withdrawAmount<=0) throw new InvalidAmountException("Please enter valid amount for withraw");
double currentBalance=c.getBalance();
double afterWithdrawAmount=currentBalance-withdrawAmount;
if(afterWithdrawAmount<0) 
{
    throw new InsufficientBalanceException("Insufficient balance, Please enter valid amount \n, Available balance is :"+currentBalance);
}
c.setBalance(afterWithdrawAmount);
System.out.println(withdrawAmount+" Rs is withdrawed");
System.out.println("Available balance Rs :"+afterWithdrawAmount);
}


public void deposite(String accountNumber,double depositeAmount) throws Exception
{
    if(!accountNumberWiseCustomer.containsKey(accountNumber))
    {
throw new AccountNotFoundException("Invalid Account Number please enter valid account Number ");
    }
   
   Customer c= accountNumberWiseCustomer.get(accountNumber);
double currentBalance=c.getBalance();
double afterDepositeBalance=currentBalance+depositeAmount;

c.setBalance(afterDepositeBalance);
System.out.println(depositeAmount+" Rs is deposited");
System.out.println("Available balance Rs :"+afterDepositeBalance);
}
public Customer getCustomerByAccountNumber(String accountNumber)
{
    return null;
}

public static void main(String gg[])
{
    Bank b=new Bank();
    Scanner sc=new Scanner(System.in);
while(true)
{
    System.out.println("1.Create new Account :");
System.out.println("2.Edit Account Details :");
System.out.println("3.Remove Account :");
System.out.println("4.Show All Accounts :");
System.out.println("5.Deposite: ");
System.out.println("6.Withdraw :");
System.out.println("7.Exit Software :");
System.out.println("Enter a number to operate 1-7");
int num=sc.nextInt();
try
{
if(num==1)
{
    Customer c=new Customer();
    System.out.print("Enter Account holder Name: ");
    sc.nextLine();
    String accountName=sc.nextLine();
    System.out.print("Enter Account Number :");
    // sc.nextLine();
    String accountNumber=sc.nextLine();
    System.out.print("Enter Account Type :");

    String accountType=sc.nextLine();

    System.out.print("Enter Balance Amount :");
    double balance=sc.nextDouble();
    c.setAccountName(accountName);c.setAccountNumber(accountNumber);c.setAccountType(accountType);
    c.setBalance(balance);

     b.add(c);
}
else if(num==2) b.update(new Customer());
else if(num==3) 
{
    System.out.print("Enter Account Number to delete :");
    if(sc.hasNext()) sc.nextLine();
    String d=sc.nextLine();
b.delete(d);
}
else if(num==4) 
{
List<Customer> c=b.getAllCustomers();
     System.out.println("*************customer details**********");
 c.forEach((cr)->{
    System.out.println("Account Name: "+cr.getAccountName());
    System.out.println("Account Number :"+cr.getAccountNumber());
    System.out.println("Account Type :"+cr.getAccountType());
    System.out.println("Available Balance :"+cr.getBalance());
    System.out.println("----------------------------------------");
});
}
else if(num==5)
{

    System.out.print("Enter your account number :");
    if(sc.hasNext()) sc.nextLine();
    String accountNumber=sc.nextLine();
    System.out.print("Enter amount you want to deposite :");
    double depositeAmount=sc.nextDouble();
    b.deposite(accountNumber,depositeAmount);    
}
else if(num==6) 
{
    System.out.print("Enter your account number :");
    if(sc.hasNext()) sc.nextLine();
    String accountNumber=sc.nextLine();
    System.out.print("Enter amount you want to withdraw :");
    double withdraw=sc.nextDouble();
    b.withdraw(accountNumber,withdraw);

}
else if(num==7) break;
else  System.out.println("Please Enter valid operation from 1 to 5");

}catch(Exception e)
{
    System.out.println(e.getMessage());
}
}
}
}
class Customer
{
private String accountName,accountNumber,accountType;
private double balance;
public String getAccountName() {
    return accountName;
}

public void setAccountName(String accountName) {
    this.accountName = accountName;
}

public String getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public String getAccountType() {
    return accountType;
}

public void setAccountType(String accountType) {
    this.accountType = accountType;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

}
class InsufficientBalanceException extends RuntimeException
{
     InsufficientBalanceException(String message)
    {
     super(message);       
    
    }
}
class InvalidAmountException extends RuntimeException
{
    InvalidAmountException(String message)
    {
    super(message);       
    
    }
}
class AccountNotFoundException extends RuntimeException
{
    AccountNotFoundException(String message)
{
    super(message);
    
}
}