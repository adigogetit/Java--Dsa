
import java.util.*;

public class Maximum_Circular_Sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;

        while (t > a) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            a++;
            System.out.println(sum(n, arr));
        }
    }

    public static int sum(int n, int[] arr) {

        int max = maxSubArray(arr);

        int tsum = 0;
        for(int i=0; i<n;i++){
            tsum = tsum + arr[i];
            arr[i] = arr[i] * -1;
        }

        int csum = tsum + maxSubArray(arr);
        if(csum == 0) return max;
        return Math.max(max,csum);

        // int maxSum = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        // int sum = 0;

        // for (int k = 0; k < n; k++) {
        // sum = sum + arr[(i + k) % n];
        // maxSum = Math.max(maxSum, sum);
        // }
        // }
        // return maxSum;
    }

    public static int maxSubArray(int[] arr) {

        int sum = 0;
        int masX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            masX = Math.max(masX, sum);

            if (sum < 0)
                sum = 0;
        }
        return masX;
    }
}
