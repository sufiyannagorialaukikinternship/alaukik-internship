import java.util.*;
 class TextProcessingUtility
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        while(true)
        {
            System.out.println("1.Reverse a String ");
            System.out.println("2.Count Character ");
            System.out.println("3.Count words ");
            System.out.println("4.Palnidrome ");
            System.out.println("5.Remove Duplicate Characters");
          System.out.print("CHOOSE OPERATION FROM 1-5: ");
            int num=sc.nextInt();
            if(num==1)
          {
            
                System.out.print("Enter a String :");
                if(sc.hasNext()) sc.nextLine();
                str=sc.nextLine();
System.out.println("Reverse of "+str+" is :"+reverseString(str));
          }
            else if(num==2)
        {
                System.out.print("Enter a String :");
                if(sc.hasNext()) sc.nextLine();
                str=sc.nextLine();
System.out.println("Character count of  "+str+" is :"+countCharacter(str));
        }else if(num==3)
        {
                System.out.print("Enter a String :");
                if(sc.hasNext()) sc.nextLine();
                str=sc.nextLine();
System.out.println("Word count of String is "+str+" is :"+countWords(str));

        }else if(num==4)
        {
    System.out.print("Enter a String :");
                if(sc.hasNext()) sc.nextLine();
                str=sc.nextLine();
System.out.println("String  "+str+" is Palindrome :"+isPalindrome(str));

        }
        else if(num==5)
        {
                System.out.print("Enter a String :");
                if(sc.hasNext()) sc.nextLine();
                str=sc.nextLine();
System.out.println("After Remove duplicate of "+str+" is becomes :"+removeDuplicateCharacter(str));
        }else
        {
            System.out.println("Please Choose Corrrect operation :");
        }
    
        }
    }
    private static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
    return true;
    }
    private static String removeDuplicateCharacter(String str)
    {
        char[] strChar=str.toCharArray();
        int j=1;
        int i=0;    
           while(i<strChar.length-1 && j<strChar.length)
           {
            if(strChar[i]!=strChar[j]) 
            {
                i++;
                j++;
            }
            else 
            {
                while(j<strChar.length && strChar[i]==strChar[j]) j++;
                if(j==strChar.length) break;
                 i++;
                     char tmp=strChar[i];
            strChar[i]=strChar[j];
            strChar[j]=tmp;
            j++;
            }
           }
                        return new String(Arrays.copyOf(strChar,i+1));
    }
    private static int countCharacter(String str)
    {
        return str.length();
    }
    private static int countWords(String str)
    {
        str=str.trim();
        int wordCount=0;
        int spcCount=0;
     for(int i=0;i<str.length();i++)if(str.charAt(i)==' ') spcCount++;
     wordCount=spcCount+1;
     return wordCount;
    }
    private static String reverseString(String str)
{
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
        String reverseStr=new String(strChar);
        return reverseStr;
}
}