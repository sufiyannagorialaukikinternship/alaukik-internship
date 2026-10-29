import java.util.*;
public class Searching
{
    private int arr[];
    public boolean search(int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num) return true;
        }
        return false;
    }
    public static void main(String gg[])
    {
        Searching s=new Searching();
        Scanner sc=new Scanner(System.in);
        s.arr=new int[10];
        for(int i=0;i<s.arr.length;i++)
        {
        System.out.print("Enter a number :");
        s.arr[i]=sc.nextInt();
        }
        while(true)
        {
            System.out.print("Enter a number to search: ");
            int num=sc.nextInt();
            System.out.println("is "+num+" exists :"+s.search(num));
        }
    }
}