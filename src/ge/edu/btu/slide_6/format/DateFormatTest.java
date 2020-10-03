package ge.edu.btu.slide_6.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {

    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm:ss SSS a");

        String str = "20/10/2020 15:40:55";
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter1);
        System.out.println(dateTime.format(formatter2));
    }
}


