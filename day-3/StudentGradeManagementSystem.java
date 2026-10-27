 import java.util.*;
 class StudentMarksCalculator
{
    private float mathMarks,englishMarks,hindiMarks,scienceMarks,sanskritMarks,totalMarks,totalPercentage;
    private String grade,studentName;
    private Scanner sc=new Scanner(System.in);
    public void AcceptMarks()
    {
        System.out.print("Enter your math marks :");
        mathMarks=sc.nextFloat();
        System.out.print("Enter your English marks :");
        englishMarks=sc.nextFloat();
        System.out.print("Enter your Hindi marks :");
        hindiMarks=sc.nextFloat();
         System.out.print("Enter your Science marks :");
         scienceMarks=sc.nextFloat();
             System.out.print("Enter your Sanskrit marks :");
         sanskritMarks=sc.nextFloat();


    }

   public void calculateTotal()
   {
    totalMarks=mathMarks+englishMarks+hindiMarks+scienceMarks+sanskritMarks;
   }
   public void calculatePercentage()
   {
       totalPercentage=(totalMarks/500)*100;
   }
   public void calculateGrade()
   {
    if(totalPercentage>=75) grade="A+";
    else if(totalPercentage<75 && totalPercentage>=70) grade="A";
    else if(totalPercentage<70 && totalPercentage>=65) grade="B+";
    else if(totalPercentage<65 && totalPercentage>=60) grade="B";
    if(totalPercentage<60 && totalPercentage>50) grade="C+";
    else if(totalPercentage<50 && totalPercentage>=40) grade="C";
    else if(totalPercentage<40 && totalPercentage>=33) grade="D";
    else if(totalPercentage<33) grade="F";
   }
   public void print()
   {
System.out.println("Total marks :"+totalMarks+" out of 500");
System.out.println("Percentage :"+totalPercentage+"%");
System.out.println("Grade :"+grade);
if(totalPercentage<33) System.out.println("Fail");
else System.out.println("Pass");
   }

    public static void main(String gg[])
    {
        StudentMarksCalculator s=new StudentMarksCalculator();
        s.AcceptMarks();
        s.calculateTotal();
        s.calculatePercentage();
        s.calculateGrade();
        s.print();
    }
    
}





