package week1;
import java.time.LocalDateTime;
import java.time.Duration;


public class Age {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2004, 5, 31, 10, 30, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();

        Duration duration = Duration.between(dateTime1, dateTime2);

        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Difference: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}

