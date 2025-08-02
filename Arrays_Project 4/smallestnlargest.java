public class smallestnlargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 10, 50};
        int n = arr.length;
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
            if (arr[i] > largest)
                largest = arr[i];
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
