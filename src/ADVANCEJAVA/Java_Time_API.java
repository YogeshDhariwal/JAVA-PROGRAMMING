package ADVANCEJAVA;
// java.time package have classes to get the exact time and date which is not changeable
import java.time.*;
public class Java_Time_API {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}
