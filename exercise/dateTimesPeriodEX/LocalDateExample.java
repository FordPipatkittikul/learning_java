package dateTimesPeriodEX;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2003,1,7);
        System.out.println(birthday);

        LocalTime oneThirty = LocalTime.of(13,30);
        System.out.println(oneThirty);

        LocalDateTime ex = LocalDateTime.of(2023,11,21,18,0);
        System.out.println(ex);

        LocalTime fivePM = LocalTime.of(17,0);
        LocalTime nineAM = LocalTime.of(9,0);
        System.out.println(Duration.between(fivePM,nineAM));

        LocalDate janFirst = LocalDate.of(2023,1,1);
        LocalDate decThirtyOne = LocalDate.of(2024,12,31);
        System.out.println(Period.between(janFirst,decThirtyOne));

        // Format a LocalDateTime object
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = current.format(formatter);
        System.out.println(formattedDateTime);

        // Parse a date String into a LocalDate object
        String dateString = "21-11-2023";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println(parsedDate);
    }
}
