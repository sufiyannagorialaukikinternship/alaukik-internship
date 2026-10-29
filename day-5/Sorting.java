import java.util.*;
class Sorting
{
    public static void sort(int arr[])
    {
     int e=0;
     int f=0;
     int m=arr.length-1;
while(e<m)
{
     while(e<m)
     {
        f=e+1;

        if(arr[e]>arr[f])
        {
            int tmp=arr[e];
            arr[e]=arr[f];
            arr[f]=tmp;
        }
        e++;
     }
     e=0;
     m--;
}
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<arr.length;i++)
        {
        System.out.println("Enter a number :");
        arr[i]=sc.nextInt();
        }
    sort(arr);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
        
    }
}