import java.util.*;
class StudentResultManagementSystem
{
    private List<Student> studentList;
    private Map<Integer,Student> rollNumberWiseStudentMap;
    private Map<String,Student> nameWiseStudentMap;
    private Scanner sc=new Scanner(System.in);

StudentResultManagementSystem()
{
  studentList=new ArrayList<>();
  rollNumberWiseStudentMap=new HashMap<>();
  nameWiseStudentMap=new HashMap<>();
}
 
  public void showOptions()
  {
    System.out.println("1. Insert New Student :");
    System.out.println("2. Update Student :");
    System.out.println("3. Remove Student :");
    System.out.println("4. Show All Student details :");
     System.out.println("5. Get Student Result By rollNumber :");
     System.out.print("Enter a number to operate 1-5 :");
     int choice=sc.nextInt();
    performOperation(choice);
  }
  public void performOperation(int choice)
  {
if(choice<1 || choice>5) 
{
    System.out.println("Invalid number, please choose 1-5");
    System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();

}
if(choice==1)  addStudent();
else if(choice==2) updateStudent();
else if (choice==3) removeStudent();
else if(choice==4) getStudent();
else if(choice==5) getStudentByRollNumber();
  }
  public void addStudent()
  {
    System.out.println("Student (Add Module)");
    
    System.out.print("Add student name :");
    sc.nextLine();
    String studentName=sc.nextLine();
    System.out.print("Add Student roll number :");
    int rollNumber=sc.nextInt();
    System.out.println("Add Student marks :");
    System.out.print("Math :");
    int mathMarks=sc.nextInt();

    System.out.print("English :");
    int englishMarks=sc.nextInt();
    
    System.out.print("Hindi :");
    int hindiMarks=sc.nextInt();
    
    System.out.print("Science :");
    int scienceMarks=sc.nextInt();
    
    System.out.print("Sanskrit :");
    int sanskritMarks=sc.nextInt();
    if(rollNumberWiseStudentMap.containsKey(rollNumber)) 
    {
      System.out.println("Roll Number should be different to other student");
        System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();
    return;     
    }
    Student s=new Student();
    s.setStudentName(studentName);
    s.setRollNumber(rollNumber);
    s.setMathMarks(mathMarks);
    s.setEnglishMarks(englishMarks);
    s.setHindiMarks(hindiMarks);
    s.setSanskritMarks(sanskritMarks);

   int totalMarks=mathMarks+englishMarks+hindiMarks+scienceMarks+sanskritMarks;

int totalPercentage=(totalMarks*100 )/500;
String grade="";
    if(totalPercentage>=75) grade="A+";
    else if(totalPercentage<75 && totalPercentage>=70) grade="A";
    else if(totalPercentage<70 && totalPercentage>=65) grade="B+";
    else if(totalPercentage<65 && totalPercentage>=60) grade="B";
    if(totalPercentage<60 && totalPercentage>50) grade="C+";
    else if(totalPercentage<50 && totalPercentage>=40) grade="C";
    else if(totalPercentage<40 && totalPercentage>=33) grade="D";
    else if(totalPercentage<33) grade="F";
s.setTotalMarks(totalMarks);   
s.setPercentage(totalPercentage);
s.setGrade(grade);   


rollNumberWiseStudentMap.put(rollNumber,s);
studentList.add(s);
nameWiseStudentMap.put(studentName,s); 
    System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();
  }

  public void updateStudent()
{
    System.out.println("Student (Update Module)");
    Student s=getStudentByRollNumber();
    String oldName=s.getStudentName();
    int oldRollNumber=s.getRollNumber();
    System.out.println("------------------------------");
    System.out.print("Add student name :");
    sc.nextLine();
    String studentName=sc.nextLine();
    System.out.println("Add Student marks :");
    System.out.print("Math :");
    int mathMarks=sc.nextInt();

    System.out.print("English :");
    int englishMarks=sc.nextInt();
    
    System.out.print("Hindi :");
    int hindiMarks=sc.nextInt();
    
    System.out.print("Science :");
    int scienceMarks=sc.nextInt();
    
    System.out.print("Sanskrit :");
    int sanskritMarks=sc.nextInt();
    
    System.out.println("Are you sure, you want to update (Y/N)");
    sc.nextLine();

   char isUpdate=sc.nextLine().charAt(0);
   if(isUpdate=='y' || isUpdate=='Y')
   {
    s.setStudentName(studentName);
    s.setMathMarks(mathMarks);
    s.setEnglishMarks(englishMarks);
    s.setHindiMarks(hindiMarks);
    s.setSanskritMarks(sanskritMarks);

   int totalMarks=mathMarks+englishMarks+hindiMarks+scienceMarks+sanskritMarks;

int totalPercentage=(totalMarks*100 )/500;
String grade="";
    if(totalPercentage>=75) grade="A+";
    else if(totalPercentage<75 && totalPercentage>=70) grade="A";
    else if(totalPercentage<70 && totalPercentage>=65) grade="B+";
    else if(totalPercentage<65 && totalPercentage>=60) grade="B";
    if(totalPercentage<60 && totalPercentage>50) grade="C+";
    else if(totalPercentage<50 && totalPercentage>=40) grade="C";
    else if(totalPercentage<40 && totalPercentage>=33) grade="D";
    else if(totalPercentage<33) grade="F";
s.setTotalMarks(totalMarks);   
s.setPercentage(totalPercentage);
s.setGrade(grade);   


rollNumberWiseStudentMap.remove(oldRollNumber);
rollNumberWiseStudentMap.put(oldRollNumber,s);
studentList.remove(s);
studentList.add(s);
nameWiseStudentMap.remove(oldName);
nameWiseStudentMap.put(studentName,s); 
   System.out.println("Student Updated");
   }
    System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();
}
public void removeStudent()
{
Student s=getStudentByRollNumber();
 if(s==null) 
 {
  return;
 }
 System.out.println("Are you sure, you want to delete (Y/N)");
 sc.nextLine();
 char isDelete=sc.nextLine().charAt(0);
 if(isDelete=='Y' || isDelete=='y')
 {
  studentList.remove(s);
  rollNumberWiseStudentMap.remove(s.getRollNumber());
  nameWiseStudentMap.remove(s.getStudentName());
  System.out.println("Student removed");
 }
    System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();
}
public void getStudent()
{
System.out.println("***************Students List***************");
studentList.forEach((s)->{
System.out.println("Name : "+s.getStudentName());
System.out.println("Roll Number :"+s.getRollNumber());
System.out.println("Total Marks out of 500 :"+s.getTotalMarks());
System.out.println("Percentage :"+s.getPercentage());
System.out.println("Grade :"+s.getGrade());
System.out.println("-----------------------------------------------");
});
System.out.println("**************End of students**************");
  System.out.println();
        System.out.println("Press enter to continue.....");
     sc.nextLine();
    sc.nextLine();
        }
public Student getStudentByRollNumber()
{
System.out.println("Enter Roll number of student ");
int rollNumber=sc.nextInt();

Student s=rollNumberWiseStudentMap.get(rollNumber);        
 if(s==null) 
 {
  System.out.println("Student doesn't exists, Please write valid student name");
  return  s;
 }
System.out.println("Name :"+s.getStudentName());
System.out.println("roll Number :"+s.getRollNumber());
System.out.println("Marks ");
System.out.println("Math Marks:"+s.getMathMarks());
System.out.println("Hindi Marks:"+s.getHindiMarks());
System.out.println("Englih Marks :"+s.getEnglishMarks());
System.out.println("Science Marks :"+s.getScienceMarks());
System.out.println("Sanskrit Marks :"+s.getSanskritMarks());
System.out.println("Total Marks out of 500 :"+s.getTotalMarks());
System.out.println("Percentage :"+s.getPercentage());
System.out.println("Grade :"+s.getGrade());
System.out.println("************************************************");
return s;
}
    public static void main(String gg[])
    {
        StudentResultManagementSystem s=new StudentResultManagementSystem();       
 while(true)
 {
        s.showOptions();
 }
    }
}

class Student
{
  private String studentName;
  private int rollNumber;
  private int mathMarks;
  private int englishMarks;
  private int hindiMarks;
  private int scienceMarks;
  private int sanskritMarks;
  private int totalMarks;
  private int percentage;
  private String grade;



public String getStudentName() {
    return studentName;
}

public void setStudentName(String studentName) {
    this.studentName = studentName;
}


public int getRollNumber() {
    return rollNumber;
}

public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
}


public int getMathMarks() {
    return mathMarks;
}

public void setMathMarks(int mathMarks) {
    this.mathMarks = mathMarks;
}


public int getEnglishMarks() {
    return englishMarks;
}

public void setEnglishMarks(int englishMarks) {
    this.englishMarks = englishMarks;
}


public int getHindiMarks() {
    return hindiMarks;
}

public void setHindiMarks(int hindiMarks) {
    this.hindiMarks = hindiMarks;
}


public int getScienceMarks() {
    return scienceMarks;
}

public void setScienceMarks(int scienceMarks) {
    this.scienceMarks = scienceMarks;
}


public int getSanskritMarks() {
    return sanskritMarks;
}

public void setSanskritMarks(int sanskritMarks) {
    this.sanskritMarks = sanskritMarks;
}

  public void setTotalMarks(int totalMarks)
{
  this.totalMarks=totalMarks;
}
public int getTotalMarks()
{
  return this.totalMarks;
}
public void setPercentage(int percentage)
{
  this.percentage=percentage;
}
public int getPercentage()
{
  return this.percentage;
}
public void setGrade(String grade)
{
  this.grade=grade;
}
public String getGrade()
{
  return this.grade;
}


}
