import java.time.*;
class LocalTimeExample
{
    public static void main(String gg[])
    {
    LocalTime now=LocalTime.now();
    System.out.println("Current Time :"+now);

LocalTime officeStart=LocalTime.of(9,30);
LocalTime officeEnd=LocalTime.of(18,0,0);
System.out.println("Office Start at :"+officeStart);
System.out.println("Office End at :"+officeEnd);

LocalTime breakTime=officeStart.plusHours(4);
System.out.println("Break Time is :"+breakTime);

LocalTime earlier=officeEnd.minusMinutes(45);
System.out.println("Earlier "+earlier);

System.out.println("Hour :"+officeStart.getHour()+" Minute "+officeStart.getMinute());
System.out.println("Is start After end :"+officeStart.isAfter(officeEnd));

    }
}