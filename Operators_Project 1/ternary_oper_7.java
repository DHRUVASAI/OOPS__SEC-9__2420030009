import java.util.Scanner;
public class ternary_oper_7 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Greater number: " + max);
    }
}
