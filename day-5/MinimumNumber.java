import java.util.*;
class MinimumNumber
{
    public static int findMin(int arr[])
    {
         int i=0;
         int e=1;
         int lowest=arr[0];
          while(e<arr.length)
          {
            if(arr[e]<lowest) lowest=arr[e];
            e++;
          }
          return lowest;
    }
    public static void main(String gg[])
    {
      Scanner sc=new Scanner(System.in);
          int arr[]=new int[5];
          for(int i=0;i<arr.length;i++)
          {
            System.out.print("Enter a number :");
            arr[i]=sc.nextInt();
          }
          System.out.println("Minimum Number is :"+findMin(arr));
    }
}