import java.time.Duration;
import java.time.LocalTime;

public class ass1 {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(2, 30);
        LocalTime end   = LocalTime.of(9, 15);

        Duration duration;
        if (end.isBefore(start)) {
            duration = Duration.between(start, end.plusHours(24));
        } else {
            duration = Duration.between(start, end);
        }

        long hours = duration.toHours();
        long min = duration.toMinutes() % 60;

        System.out.print("Total hours worked:" + hours+" hrs "+min+" Minutes");
    }
}
