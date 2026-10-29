import java.util.*;
class MaximumNumber
{
    public static int findMax(int arr[])
    {
         int i=0;
         int e=1;
         int largest=arr[0];
          while(e<arr.length)
          {
            if(arr[e]>largest) largest=arr[e];
            e++;
          }
          return largest;
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
          System.out.println("Maximum Number is :"+findMax(arr));
    }
}