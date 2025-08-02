import java.util.Scanner;
public class compound_oper_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        x += 5;
        System.out.println(x);

        x -= 3;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 4;
        System.out.println(x);

        x %= 3;
        System.out.println(x);
    }
}
