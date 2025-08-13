import java.util.Scanner;
public class ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salespersons = 2;
        int months = 3;

        double[][] sales = new double[salespersons][months];
        String[] names = new String[salespersons];

        for (int i = 0; i < salespersons; i++) {
            System.out.print("Enter name of salesperson " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            for (int j = 0; j < months; j++) {
                System.out.print("Enter sales for month " + (j + 1) + ": ");
                sales[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\nName\t\tTotal\tAverage\tPerformance");

        for (int i = 0; i < salespersons; i++) {
            double total = 0;
            for (int j = 0; j < months; j++) {
                total += sales[i][j];
            }
            double avg = total / months;
            String perf;
            if (avg >= 8000) perf = "Excellent";
            else if (avg >= 6000) perf = "Good";
            else if (avg >= 4000) perf = "Average";
            else perf = "Poor";
            System.out.println(names[i] + "\t\t" + total + "\t" + avg + "\t" + perf);
        }
    }
}
