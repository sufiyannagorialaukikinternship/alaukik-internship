import java.util.*;
class PrimeNumberChecker
{
    public static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++) 
        {
            if((num%i)==0) return false;
        }
         return true;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
     if(isPrime(num)) System.out.println(num+" is  Prime Number");
     else System.out.println(num+" is not a Prime Number");
    }
}