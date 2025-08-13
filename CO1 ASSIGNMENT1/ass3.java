import java.util.Scanner;
public class ass3 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String temp= sc.nextLine();
        float tempFloat = Float.parseFloat(temp);
        double tempDouble = Double.parseDouble(temp);
        int tempInt = (int) tempDouble;
        System.out.println("The Temperature is: "+temp);
        System.out.println("Temperature in Float: "+tempFloat);
        System.out.println("Temperature in Double: "+tempDouble);
        System.out.println("Temperature in Int: " +tempInt);

    }
}
