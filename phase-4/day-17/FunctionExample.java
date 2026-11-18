import java.util.function.*;
class FunctionExample
{
    public static void main(String gg[])
    {
       Function<String,String> f=n->"Length of string is "+n.length();
       System.out.println(f.apply("Sufiyan nagori"));
    }
}
