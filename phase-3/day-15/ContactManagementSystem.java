import java.util.*;
public class ContactManagementSystem
{
    private List<Contact> list;
    private Map<String,Contact> map;
    public ContactManagementSystem()
    {
        list=new LinkedList();
        map=new HashMap();
    }
    public void addContact(Contact contact)
    {

        
        String contactNumber=contact.getContactNumber();
        String contactName=contact.getContactName();
        if(contactNumber==null) 
        {
            System.out.println("Please Enter Valid contact Number  contact Number should not be null");
            return;
        }
        contactNumber=contactNumber.trim();
        if(contactNumber.length()==0 || contactNumber.length()!=10) 
    {
                System.out.println("Please Enter Valid contact Number, please enter valid contact Number");
            return;
    }

        if(contactName==null) 
        {
            System.out.println("Please Enter Valid contact Name  contact Name should not be null");
            return;
        }
        contactName=contactName.trim();
        if(contactName.length()==0) 
    {
                System.out.println("Please Enter Valid contact Name  contact Name required");
            return;
    }


        if(map.containsKey(contact))
        {
            System.out.println("Please Enter another contact Number \n this contact Number is saved as "+map.get(contact).getContactName());
            return;
        }    
        Contact c=new Contact();
        c.setContactNumber(contactNumber);
        c.setContactName(contactName);
        list.add(c);
        map.put(contactNumber,c);
        System.out.println("New Contact is Added");
    }
    public Contact getContact(String contactNumber)
    {
        Contact c=map.get(contactNumber);
        if(c==null)
        {
            System.out.println("Please Enter another contact Number ");
            return null;
        }    
        Contact contact=new Contact();
        contact.setContactNumber(c.getContactNumber());
        contact.setContactName(c.getContactName());
return c;
    }
    public void updateContact(Contact contact)
    {    
        String contactNumber=contact.getContactNumber();
        String contactName=contact.getContactName();
        if(contactNumber==null) 
        {
            System.out.println("Please Enter Valid contact Number  contact Number should not be null");
            return;
        }
        contactNumber=contactNumber.trim();
        if(contactNumber.length()==0 || contactNumber.length()!=10) 
    {
                System.out.println("Please Enter Valid contact Number, please enter valid contact Number");
            return;
    }

        if(contactName==null) 
        {
            System.out.println("Please Enter Valid contact Name  contact Name should not be null");
            return;
        }
        contactName=contactName.trim();
        if(contactName.length()==0) 
    {
                System.out.println("Please Enter Valid contact Name  contact Name required");
            return;
    }

        Contact c=new Contact();
        c.setContactNumber(contactNumber);
        c.setContactName(contactName);
        list.remove(c);
        map.remove(contactNumber);

        list.add(c);
        map.put(contactNumber,c);
        System.out.println("Contact is updated..");
    
    }
    public void removeContact(String contactNumber)
    {
        if(contactNumber==null) 
        {
            System.out.println("Please Enter Valid contact Number  contact Number should not be null");
            return;
        }
        contactNumber=contactNumber.trim();
        if(contactNumber.length()==0 || contactNumber.length()!=10) 
    {
                System.out.println("Please Enter Valid contact Number, please enter valid contact Number");
            return;
    }

     
        Contact c=map.get(contactNumber);
        if(c==null)
        {
            System.out.println("Enter valid contact number, contact Number Can't exists");
            return;
        }
       
        list.remove(c);
        map.remove(contactNumber);
        System.out.println("Contact is Deleted..");
    }
    public List<Contact> getAllContact()
    {
        List<Contact> contactList=new ArrayList<>();
        Contact c=null;
        for(Contact contact:list)
        {
            c=new Contact();
            c.setContactName(contact.getContactName());
            c.setContactNumber(contact.getContactNumber());
            contactList.add(c);
        }
        return contactList;
    }
}