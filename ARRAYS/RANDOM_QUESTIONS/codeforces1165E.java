import java.util.*;

public class codeforces1165E {
    // Two Arrays and Sum of Functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        Integer[] b = new Integer[n];

        long mod = 998244353;

        for(int i=0 ;i<n; i++){
            long x = sc.nextLong();
            a[i] =(long) (i+1)*(n-i) * x;
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());

        long sum = 0;
        for(int i=0; i<n; i++){
            sum = (sum + (a[i] % mod) * b[i]) % mod;
        }
        System.out.println(sum);
    }
}
