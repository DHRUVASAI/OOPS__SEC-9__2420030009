import java.util.Scanner;

public class arthametic_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("addition:"+ (a + b));
        System.out.println("subtration:"+ (a - b));
        System.out.println("product:"+ (a * b));
        System.out.println("division:"+ (a / b));
        System.out.println("modulas:"+ (a % b));
    }
}
