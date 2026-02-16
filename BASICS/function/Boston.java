import java.util.*;
public class Boston {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(sum(n)==lcm(n)){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }

    public static int sum(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            sum = sum + d;
            n=n/10;
        }
        return sum;
    }

    public static int lcm(int n){
        int s = 0;

        while(n%2==0){
            s = s + 2;
            n = n / 2;
        }

        for(int i = 3; i*i<=n; i+=2){
            while(n%i==0){
                s  = s + sum(i);
                n = n/i;
            }
        }

        if(n>1){
            s = s + sum(n);
        }
        return s;
    }
}