import java.util.*;
public class reverse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(rev(n));
    }

    public static int rev(int n){

       int r = 0;

        while(n>0){
            int d = n%10;
            r = r * 10 + d;
            n = n / 10;
        }
        
        return r;
    }
}