import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;
        while(i<=n){

            int j=1;
            while(j<=n-i+1){
                System.out.print(" *");
                j++;
            }

            int k=1;
            while(k<=((i-1)*2-1)){
                System.out.print("  ");
                k++;
            }

            int l=1;
            while(l<=(i==1?n-i:n-i+1)){
                System.out.print(" *");
                l++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
