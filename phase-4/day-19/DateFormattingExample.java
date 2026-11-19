import java.time.*;
import java.time.format.*;
class DateFormattingExample
{
 public static void main(String gg[])
 {
    LocalDateTime now=LocalDateTime.now();
    DateTimeFormatter displayFormat=DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");
    String formattedDateTime=now.format(displayFormat);
    System.out.println("Formatted "+formattedDateTime);

String userInput="25/12/2026";
DateTimeFormatter inputFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate christmas=LocalDate.parse(userInput,inputFormat);
System.out.println("Parsed Date is :"+christmas);
System.out.println("Christmas plus 7 days "+christmas.plusDays(7));
 }
}