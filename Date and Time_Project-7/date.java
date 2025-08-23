import java.time.LocalDate;

public class date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = LocalDate.of(today.getYear(), 12, 31);
        int daysRemaining = lastDayOfYear.getDayOfYear() - today.getDayOfYear();

        System.out.println("Today's Date: " + today);
        System.out.println("Last Date of Current Year: " + lastDayOfYear);
        System.out.println("Number of Days Remaining in the Year: " + daysRemaining);
    }
}
