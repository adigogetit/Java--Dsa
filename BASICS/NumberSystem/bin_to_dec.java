import java.util.Scanner;

public class bin_to_dec {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int sum=0;
    int pow=1;
    
    while(n>0){
        int rem = n%10;
        sum = sum + rem * pow ;
        pow = pow*2;
        n=n/10;
    }
    System.out.println(sum);
   }
}