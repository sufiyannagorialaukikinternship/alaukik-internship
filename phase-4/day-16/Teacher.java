public class Teacher
{
    private String id;
    private String name;
        public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return this.id;
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
        if(!(object instanceof Teacher)) return false;
        Teacher teacher=(Teacher) object;
        return teacher.getId().equalsIgnoreCase(this.id);
    }
public int hashCode()
{
    return id.hashCode();
}
}