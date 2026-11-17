public class Student
{
    private String rollNumber;
    private String name;
    public void setRollNumber(String rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    public String getRollNumber()
    {
        return this.rollNumber;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public boolean equals(Object object)
    {
        if(!(object instanceof Student)) return false;
        Student student=(Student) object;
        return student.getRollNumber().equalsIgnoreCase(this.rollNumber);
    }
public int hashCode()
{
    return rollNumber.hashCode();
}
}