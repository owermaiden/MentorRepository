import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        //Current timestamp in UTC
        LocalDateTime utcTimestamp = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("utcTimestamp = " + utcTimestamp);

        //local date + local time
        LocalDate date = LocalDate.of(2109, 03, 28);
        LocalDate date2 = LocalDate.parse("2015-02-20");

        LocalTime time = LocalTime.of(10, 34);
        LocalTime sixThirty = LocalTime.parse("06:30");

        LocalDateTime localDateTime5 = LocalDateTime.of(date, time);
        System.out.println("localDateTime5 = " + localDateTime5);

        // How to convert String to DateTime........................................................................

        //1 - default time pattern
        String time2 = "2019-03-27T10:15:30";
        LocalDateTime localTimeObj = LocalDateTime.parse(time2);


        // Hot to format DateTime Object............................................................................
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        String dateTimeString = LocalDateTime.now().format(formatter);	//2019-03-28 14:47:33 PM
        System.out.println(dateTimeString);

        // Some usefull methods
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow = " + tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println("previousMonthSameDay = " + previousMonthSameDay);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("sunday = " + sunday);

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("twelve = " + twelve);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("leapYear = " + leapYear);

        boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
        System.out.println("isAfter = " + isAfter);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("beginningOfDay = " + beginningOfDay);

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth = " + firstDayOfMonth);

        // Max Time 23:59:59.99
        LocalTime maxTime = LocalTime.MAX;
        System.out.println("maxTime = " + maxTime);

        // LocalDateTime with Zone--------------------------------------------------------------------------------------------

        ZoneId zoneId = ZoneId.of("Europe/Paris");

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("allZoneIds = " + allZoneIds);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
    }
}
