import java.time.*;
class LocalDateTimeExample
{
    public static void main(String gg[])
    {
        LocalDateTime now=LocalDateTime.now();
        System.out.println("Current Date Time "+now);
       
       LocalDate examDate=LocalDate.of(2026,12,10);
       LocalTime examTime=LocalTime.of(10,30);
       
       LocalDateTime examSlot=LocalDateTime.of(examDate,examTime);
       System.out.println("Exam Slot is :"+examSlot);

       LocalDateTime reshedule=examSlot.plusDays(2).plusHours(1);
       System.out.println("Reshedule Time slot :"+reshedule);

       System.out.println("Exam Date is :"+examSlot.toLocalDate());
       System.out.println("Exam Time is :"+examSlot.toLocalTime());

    }
}