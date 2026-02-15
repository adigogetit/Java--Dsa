import java.util.Scanner;

public class max_value {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(max2(arr));

    }

    public static int max2(int[] arr) {

        int m =  Integer.MIN_VALUE;  // -2^31

        for (int i = 1; i < arr.length; i++) {
            m = Math.max(m,arr[i]);
        }
        return m;
    }

    // public static int max1(int[] arr) {
    //     int m = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > m) {
    //             m = arr[i];
    //         }
    //     }
    //     return m;
    // }
}
