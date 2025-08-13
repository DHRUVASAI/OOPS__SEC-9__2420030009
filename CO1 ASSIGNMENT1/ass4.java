import java.util.Scanner;
public class ass4 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if (num<100)
            System.out.println(num + " is less than 100");
        if (num%2!=0 && num%5!=0)
            System.out.println(num+" is not divisible by 2 and 5");
        for (int i=2;i<num;i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                break;
            }
            else {
                System.out.println(num + " is prime");
                break;

            }
        }
    }
}
