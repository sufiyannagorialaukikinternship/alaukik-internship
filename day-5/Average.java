
import java.util.*;
public class Average
{

public static int findAverage(int arr[])
{
    int total=0;
    for(int i=0;i<arr.length;i++)
    {
        total+=arr[i];
    }
    return total/arr.length;
    
}
 
    public static void main(String gg[])
    {
        Searching s=new Searching();
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        System.out.print("Enter a number :");
        arr[i]=sc.nextInt();
        }
        System.out.println("Average is :"+findAverage(arr));


    }
}