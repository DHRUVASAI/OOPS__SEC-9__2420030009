import java.util.Scanner;
public class compare_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a= sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println(a+ " is greater then " +b);
        else if (a<b)
            System.out.println(a+ " smaller then " +b);
        else
            System.out.println("both are equal");
    }
}
