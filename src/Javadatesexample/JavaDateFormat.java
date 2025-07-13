package Javadatesexample;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateFormat {
    public static void main(String[] args) {
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println(DateTime);
        DateTimeFormatter dateTimeFormate = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = DateTime.format(dateTimeFormate);
        System.out.println(formattedDate);
    }
}
