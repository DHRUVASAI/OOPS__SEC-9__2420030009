import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class event {
    public static void main ( String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the date (dd mm yyyy): ");
        int day,month,year;
        day= sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        LocalDate eventDate=LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();
        Period p = Period.between(today, eventDate);
        int days = p.getYears() * 365 + p.getMonths() * 30 + p.getDays();
        if (eventDate.isAfter(today)) {
            System.out.println("The event is in " + days + " days.");
        } else if (eventDate.isBefore(today)) {
            System.out.println("The event was " + days + " days ago.");
        } else {
            System.out.println("The event is today!");
        }
    }
}
