import java.util.*;
public class lcm {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(lcm(n,m));
    }

    public static int lcm (int n,int m){

        int max = Math.max(n, m);
        for(int i = max; i <= n * m; i += max){
            if(i % n == 0 && i % m == 0){
                return i;
            }
        }
        return 0;
    }
}