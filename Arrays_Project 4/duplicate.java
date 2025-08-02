public class duplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 10, 50};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate)
                System.out.println(arr[i]);
        }
    }
}
