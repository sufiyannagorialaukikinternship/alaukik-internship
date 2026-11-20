import java.time.*;
class JavaTimeApi
{
    public static void main(String gg[]){
        ZonedDateTime indiaTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime=indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("India Time :"+indiaTime);
        System.out.println("Us (New York) Time :"+usTime);

Instant utcStamp=Instant.now();
System.out.println("UTC instant :"+utcStamp);

LocalDate birthDate=LocalDate.of(2005,3,5);
LocalDate todayDate=LocalDate.of(2026,11,20);
Period gap=Period.between(birthDate,todayDate);
System.out.println("Age  :"+gap.getYears()+" Years, "+gap.getMonths()+" Months, "+gap.getDays()+" days");

LocalTime shiftStart =LocalTime.of(9,0);
LocalTime shiftEnd=LocalTime.of(17,30);
Duration shiftLength=Duration.between(shiftStart,shiftEnd);
System.out.println("Shift minutes :"+shiftLength.toMinutes());
}
}