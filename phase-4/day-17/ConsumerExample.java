import java.util.function.*;
 class ConsumerExample
{
    public static void main(String gg[])
    {
        Consumer<String> c1=n->{
            System.out.println("hello "+n);
        };       
        c1.accept("sufiyan");
    }
}
class ConsumerClassExample
{
    public static void main(String gg[])
    {
        Student student1=new Student(101,"Sufiyan Nagori");
        Student student2=new Student(102,"Mohamamd mushef");
        Consumer<Student> c1= s->{
            System.out.println(s.getRollNumber());
            System.out.println(s.getName());
        };

        Consumer<Student> c2=s->{
            System.out.println(s.getRollNumber());
            System.out.println(s.getName());
        };
        Consumer<Student> result=c1.andThen(c2);
        result.accept(student1);
    }
}
 class Student
{
    private int rollNumber;
    private String name;
 Student(int rollNumber,String name)
 {
    this.rollNumber=rollNumber;
    this.name=name;
 }
    public void setRollNumber(int rollNumber)
{
    this.rollNumber=rollNumber;
}
public int getRollNumber()
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
}
