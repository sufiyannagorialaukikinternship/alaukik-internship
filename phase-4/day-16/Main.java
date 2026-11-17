import java.util.*;
public class Main
{
    public static void main(String gg[])
    {
 
      Repository<Student> studentRepo=new Repository<>();
      Student student=new Student();
      student.setRollNumber("101");
      student.setName("Rahul");
      studentRepo.add(student);

student=new Student();
      student.setRollNumber("102");
      student.setName("Ankit");
      studentRepo.add(student);

student=new Student();
      student.setRollNumber("103");
      student.setName("Bhanu");
      studentRepo.add(student);

student=new Student();
      student.setRollNumber("104");
      student.setName("Anuj");
      studentRepo.add(student);

student=new Student();
      student.setRollNumber("105");
      student.setName("Ajay");
      studentRepo.add(student);

student=new Student();
      student.setRollNumber("106");
      student.setName("Gopal");
      studentRepo.add(student);


List<Student> studentList=new ArrayList<>();
studentList=studentRepo.getAll();
studentList.forEach((s)->{
    System.out.println("Student Roll Number :"+s.getRollNumber());
    System.out.println("Student Name :"+s.getName());
});
 

      Repository<Teacher> teacherRepo=new Repository<>();
      Teacher teacher=new Teacher();
      teacher.setId("101");
      teacher.setName("Neha");
      teacherRepo.add(teacher);

teacher=new Teacher();
      teacher.setId("102");
      teacher.setName("Aadil");
      teacherRepo.add(teacher);

teacher=new Teacher();
      teacher.setId("103");
      teacher.setName("Imran");
      teacherRepo.add(teacher);

teacher=new Teacher();
      teacher.setId("104");
      teacher.setName("Alimudding");
      teacherRepo.add(teacher);

teacher=new Teacher();
      teacher.setId("105");
      teacher.setName("Shakshi");
      teacherRepo.add(teacher);

teacher=new Teacher();
      teacher.setId("106");
      teacher.setName("Kelkar");
      teacherRepo.add(teacher);


List<Teacher> teacherList=new ArrayList<>();
teacherList=teacherRepo.getAll();
teacherList.forEach((s)->{
    System.out.println("Teacher Id :"+s.getId());
    System.out.println("Teacher Name :"+s.getName());
});


        //   while(true)
        //   {
        //     System.out.println("1.Insert new Data :");
        //     System.out.println("2.Edit data :");
        //     System.out.println("3.Delete data :");
        //     System.out.println("4.Show All Data :");
        //     System.out.print("Enter a number :");
        //     InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        //     BufferredReader bufferedReader=new BufferedReader(inputStreamReader);
        // if(num==1)
        // {}
        // else if(num==2)
        // {}else if(num==3)
        // {} else if(num==4)
        // {}else System.out.println("Inalid input please select from 1 to 4");
        //   }
    }
}