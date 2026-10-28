import java.util.*;
class ReverseNumber
{
    public static int reverse(int num)
    {
        int n=num;
        int div=1;
        while(n!=0)
        {
            n=n/10;
       div*=10;        
        }
        div/=10;
        int rev=0;
        int dd=0;
        int nnn=0;
        while(div!=0)
        {
            dd=div;
            nnn=num;
while(dd!=0)
{
    if(nnn%dd==0) break;
    nnn=nnn%dd;
    dd/=10;
}
rev=div*nnn+rev;
div/=10;
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