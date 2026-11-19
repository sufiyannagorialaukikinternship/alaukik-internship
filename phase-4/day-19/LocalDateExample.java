import java.time.*;
class LocalDateExample
{
    public static void main(String gg[])
{
   LocalDate today=LocalDate.now();
   System.out.println("Today date is :"+today);
 
 LocalDate launchDate=LocalDate.of(2026,Month.AUGUST,15);
 System.out.println("Launch date is :"+launchDate);

 LocalDate nextWeek=today.plusDays(7);
 System.out.println("Next week  is :"+nextWeek);

 LocalDate lastMonth=today.minusMonths(1);
 System.out.println("next month is :"+lastMonth);

 System.out.println("Is Today is after launch Date ? "+today.isAfter(launchDate));
 System.out.println("Year :"+today.getYear());
 System.out.println("Day of week :"+today.getDayOfWeek());
}
}