package _crprepration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;

public class _011DateAndTimeAPI {
    public static void main(String[] args) {
        // LocalDate: Represents a date without time
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, 7, 11);
        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);

        // LocalTime: Represents a time without date
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(15, 30);
        System.out.println("Current Time: " + now);
        System.out.println("Time: " + time);

        // LocalDateTime: Combines date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime appointment = LocalDateTime.of(2024, 7, 11, 10, 0);
        System.out.println("Current DateTime: " + currentDateTime);
        System.out.println("Appointment: " + appointment);

        // ZonedDateTime: Represents a date and time with a time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime meeting = ZonedDateTime.of(2024, 7, 11, 10, 0, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("Current ZonedDateTime: " + zonedDateTime);
        System.out.println("Meeting (New York): " + meeting);

        // Duration: Represents a time-based amount of time
        Duration duration = Duration.between(LocalTime.of(9, 0), LocalTime.of(17, 0));
        System.out.println("Duration: " + duration);

        // Period: Represents a date-based amount of time
        Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.of(2024, 1, 1));
        System.out.println("Period: " + period);

        // Formatting and Parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        LocalDate parsedDate = LocalDate.parse("11/07/1990", formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}

