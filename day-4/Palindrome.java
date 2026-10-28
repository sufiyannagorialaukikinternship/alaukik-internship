import java.util.*;
class Palindrome
{
    public static boolean isPalindrome(String str)
    {
        int ub=str.length()-1;
        int lb=0;
        while(lb<ub)
        {
        if(str.charAt(lb)!=str.charAt(ub))return false;
        ub--;
        lb++;
        }
        return true;
    }
public static void main(String gg[])
{
    Scanner sc=new Scanner(System.in);
  System.out.print("Write a String to check palindrome or not :");
  String str=sc.nextLine();
  if(isPalindrome(str)) System.out.println(str+" is Palindrome");
  else System.out.println(str+" is not a palindrome");

}
}
