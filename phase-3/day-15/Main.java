import java.util.*;
import java.io.*;
public class Main
{
public static void main(String gg[])
{
    String contactNumber="";
    String contactName="";
    Contact contact=null;
    ContactManagementSystem cms=new ContactManagementSystem();
    
    while(true)
    {
        System.out.println("1.Save new Contact :");
        System.out.println("2.Edit Contact :");
        System.out.println("3.Remove contact :");
        System.out.println("4.Show All contact :");
        System.out.println("5.Search Contact :");
        System.out.print("Choose operation from 1 to 5 :");
    try
    {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inputStreamReader);
       int num=Integer.parseInt(br.readLine());
       
       if(num==1)
       {
        System.out.print("Enter a contact Number of 10 digit :");
         contactNumber=br.readLine();
        System.out.print("Enter Contact Name :");
         contactName=br.readLine();
 contact=new Contact();
        contact.setContactNumber(contactNumber);
        contact.setContactName(contactName);
        cms.addContact(contact);
       }else if(num==2)
       {
System.out.print("Enter a contact Number of 10 digit :");
         contactNumber=br.readLine();
        System.out.print("Enter Contact Name :");
         contactName=br.readLine();
 contact=new Contact();
        contact.setContactNumber(contactNumber);
        contact.setContactName(contactName);
        cms.updateContact(contact);
       }
       else if(num==3)
       {
        System.out.print("Enter a contact Number of 10 digit :");
         contactNumber=br.readLine();
        cms.removeContact(contactNumber);
       }
       else if(num==4)
       {
           List<Contact>  contactList=cms.getAllContact();
           System.out.println("***********************************************");
            System.out.println("Contact Number | Contact Name");
           contactList.forEach((c)->{
             System.out.println(c.getContactNumber()+"     | "+c.getContactName());
           });
           System.out.println("*************Contact Number Ends***************");
       }
       else if(num==5)
       {

System.out.print("Enter a contact Number of 10 digit :");
         contactNumber=br.readLine();
          
        contact=cms.getContact(contactNumber);
        if(contact==null) continue;
        System.out.println("**************************************");
             System.out.println("Contact Number | Contact Name");
             System.out.println(contact.getContactNumber()+"     | "+contact.getContactName());
        System.out.println("**************************************");
       }
       else System.out.println("Please Choose Valid operation 1-5:");
    }catch(IOException io)
    {
        System.out.println(io.getMessage());
    }
}
}
}