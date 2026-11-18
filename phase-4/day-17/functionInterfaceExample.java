import java.util.function.*;
interface FunctionInterface
{
     void show();
}
class ShowCase
{
    public static void main(String gg[])
    {
        FunctionInterface f=new FunctionInterface(){
               public void show()
               {
                System.out.println("Hello world");
               }
        };
        f.show();
    }
}
class lambdaExpression
{
    public static void main(String gg[])
    {
        FunctionInterface f=()->{
System.out.println("hello Lambda Expression");
        };
        f.show();
    }
}
class PredicateExample
{
    public static void main(String gg[])
    {
        Predicate<Integer> p=n->n%2==0;
       System.out.println(p.test(20));
       System.out.println(p.test(11));
    }
}