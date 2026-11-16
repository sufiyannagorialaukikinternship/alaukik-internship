public class Contact
{
    private String contactNumber;
    private String contactName;
    public void setContactNumber(String contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public String getContactNumber()
    {
        return this.contactNumber;
    }
    public void setContactName(String contactName)
    {
    this.contactName=contactName;
    }
    public String getContactName()
    {
        return this.contactName;
    }
    public boolean equals(Object object)
    {
        if(!(object instanceof Contact)) return false;
        Contact contact=(Contact) object;
        return contact.getContactNumber().equals(this.contactNumber);
    }
    public int hashCode()
    {
        return contactNumber.hashCode(); 
    }
}