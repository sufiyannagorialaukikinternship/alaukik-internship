import java.util.*;
import java.util.stream.*;
public class Stream
{
    public static void main(String gg[])
{
List<String> currentList=Arrays.asList("Laptop","Mouse","Keyboard","Joypad","Remote","Speaker","Head phones","Web cam","Pen drive","Mouse","Keyboard");

System.out.println("Before operation list  is ");
System.out.println(currentList);
System.out.println("=======================================================================\n");

System.out.println("--> operation : distinct()");
System.out.println("Before :"+currentList);
currentList=currentList.stream().distinct().collect(Collectors.toList());
                                 System.out.println("After :"+currentList);


System.out.println("\n\n--> operation : filter()");
System.out.println("Before :"+currentList);
currentList=currentList.stream().filter(item->item.length()>=5).collect(Collectors.toList());
System.out.println("After :"+currentList);


System.out.println("\n\n--> operation : map() for converting all String to upperCase");
System.out.println("Before :"+currentList);
currentList=currentList.stream().map(String::toUpperCase).collect(Collectors.toList());
System.out.println("After :"+currentList);




System.out.println("\n\n--> operation : sorted() for sorting");
System.out.println("Before :"+currentList);
currentList=currentList.stream().sorted().collect(Collectors.toList());
System.out.println("After :"+currentList);





System.out.println("\n\n--> operation : limit(3) limit(4) to set limited value");
System.out.println("Before :"+currentList);
currentList=currentList.stream().limit(4).collect(Collectors.toList());
System.out.println("After :"+currentList);




System.out.println("\n\n--> operation : forEach iteration to set limited value");
System.out.println("Before :"+currentList);
System.out.println("Iteration->");
currentList.stream().forEach(item->System.out.println("[ " +item+ " ]")); 




System.out.println("\n\n--> operation :reduce() [sabhi products name ke character ka sum nikalnaa]");
System.out.println("Before :"+currentList);
System.out.println("Iteration->");
int totalChars=currentList.stream().map(String::length).reduce(0,(sum,len)->sum+len);
System.out.println("Total Character count is :"+totalChars);


}
}