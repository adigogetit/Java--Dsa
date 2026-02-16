import java.util.*;
public class bin_to_dec {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(convert(n));
    }

    public static int convert(int n){

       int dec=0;
        int pow = 0;
        while(n>0){
            int d = n%10;
            dec = dec + d * (int)Math.pow(2,pow);
            pow++;
            n = n / 10;
            
        }
        
        return dec;
    }
}