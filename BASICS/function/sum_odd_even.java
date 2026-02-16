import java.util.*;
public class sum_odd_even {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

    public static int sum(int n){

        int even = 0;
        int odd = 0;
        int placed = 1;

        while(n>0){
            int d = n%10;
            if(placed%2==0){
                odd = odd + d;
            }
            else{
                even = even + d;
            }
            placed++;
            n = n / 10;
        }
        System.out.println(even);
        
        return odd;
    }
}