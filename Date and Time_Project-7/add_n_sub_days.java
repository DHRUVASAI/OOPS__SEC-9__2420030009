import java.util.Scanner;
import java.time.LocalDate;
public class add_n_sub_days {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the date (dd mm yyyy): ");
        int day,month,year;
        day= sc.nextInt();
        month=sc.nextInt();
        year=sc.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        LocalDate add30=date.plusDays(30);
        System.out.println("New date after adding 30 days: "+add30);
        LocalDate sub60=date.minusDays(60);
        System.out.println("New date after subtracting 60 days: "+sub60);
    }
}
