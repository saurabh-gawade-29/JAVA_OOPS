package Javadatesexample;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        LocalTime objT = LocalTime.now();
        LocalDateTime objDT = LocalDateTime.now();
        System.out.println(obj);
        System.out.println(objT);
        System.out.println(objDT);
    }
}
