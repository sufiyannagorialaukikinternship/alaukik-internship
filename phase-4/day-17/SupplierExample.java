import java.util.*;
import java.util.function.*;
class SupplierExample
{
    public static void main(String gg[])
    {
        Supplier<Integer> otp=()->100000+new Random().nextInt(900000);
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
    }
}

