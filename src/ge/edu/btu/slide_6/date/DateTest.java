package ge.edu.btu.slide_6.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date = date.plusDays(5);
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}


