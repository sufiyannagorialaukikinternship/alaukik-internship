import java.util.*;
class FabonacciSeries
{
    public static void printFabonacci(int num)
    {
// 0,1,1,2,3,5,8,13,21,34,55,89.....
int prev=0;
int curr=1;
System.out.print(prev);
int tmp=0;
while(curr<num)
{
System.out.print(","+curr);
tmp=curr;
curr=prev+curr;
prev=tmp;
}
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
     printFabonacci(num);
    }
}