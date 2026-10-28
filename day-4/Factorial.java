import java.util.*;
class Factorial
{
    public static int factorial(int num)
    {
        int j=1;
        for(int i=1;i<=num;i++)
        {
            j=j*i;

        }
        return j;
    }
  public static void main(String gg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number :");
   int num=sc.nextInt();
   
   System.out.println("Factorial of Number :"+num+" is "+factorial(num));
  }
}