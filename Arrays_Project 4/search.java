import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i=0;i< numbers.length;i++) {
            if (numbers[i] == key) {
                found = true;
                System.out.println(key + " found at "+i);
                break;
            }
        }
        if (!found)
            System.out.println(key + " not found");
    }
}
