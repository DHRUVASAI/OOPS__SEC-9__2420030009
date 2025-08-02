import java.util.Scanner;
public class logicaland_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks_theory;
        int marks_practical;
        marks_practical= sc.nextInt();
        marks_theory=sc.nextInt();
        if(marks_practical>=35 && marks_theory>=35)
            System.out.println("student passed");
        else
            System.out.println(("student failed"));
    }
}
