import java.util.*;
public class Reverse
{
    public static void main(String gg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String to reverse:");
        String str=sc.nextLine();
        char[] strChar=str.toCharArray();
        int i=0;
        int j=strChar.length-1;
        while(i<j)
        {
            char tmp=strChar[i];
            strChar[i]=strChar[j];
            strChar[j]=tmp;
            i++;
            j--;
        }
        str=new String(strChar);
        System.out.println("Reverse String is :"+str);

    }
}