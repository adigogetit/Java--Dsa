import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //    lower half diamond
        
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            
            int j=1;
            while(j<=i-1){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=((n-i)*2)+1){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
