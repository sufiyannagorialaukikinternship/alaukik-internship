import java.util.*;
class ReverseNumber2
{
    public static int reverse(int num)
    {
 int rev=0;
 while(num>0)
 {
    int d=num%10;
    rev=rev*10+d;
    num/=10;
 }
 return rev;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");
      int num=sc.nextInt();
    
       System.out.println("Reverse number of "+num+" is"+  reverse(num));
    }
}