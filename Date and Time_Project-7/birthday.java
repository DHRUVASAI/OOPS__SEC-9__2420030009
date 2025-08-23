import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class birthday {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth date (dd mm yyyy): ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate bday=LocalDate.of(year,month,day);
        LocalDate today=LocalDate.now();
        Period age=Period.between(bday,today);
        System.out.println("AGE:"+age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days ");



    }
}
