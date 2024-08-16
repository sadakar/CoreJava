package _crpreparation_java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;

public class DateAndTimeAPI {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		Duration duration = Duration.between(localDateAndTime, zonedDateTime);
		System.out.println(duration);
		
		Period period = Period.between(LocalDate.of(2020, 1, 1), LocalDate.of(2024, 1, 1));
		System.out.println(period);
	}
}
