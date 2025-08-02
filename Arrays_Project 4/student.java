
 import java.util.Scanner;
public class student {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks[]=new int[6];
        int sum=0;int avg =0;
        for(int i=0;i< marks.length;i++){
            marks[i]= sc.nextInt();
            sum+=marks[i];
        }
        avg=sum/6;
        System.out.println("Total Marks :"+sum);
        System.out.println("Average Marks:"+avg);
        for(int i=0;i< marks.length;i++){
            System.out.println("Marks of subject"+i+": "+marks[i]);
        }


    }
}
