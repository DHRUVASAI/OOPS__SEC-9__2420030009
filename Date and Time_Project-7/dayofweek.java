import java.util.Scanner;
import java.time.LocalDate;
public class dayofweek {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date (dd mm yyyy): ");
        int day,month,year;
        day= sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        System.out.println("Day of the week: "+date.getDayOfWeek());

    }
}
