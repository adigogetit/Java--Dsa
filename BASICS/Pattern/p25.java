import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int l = 1; 
        int i=1;
        while(i<=n){

            int j=1;
            while(j<=n-i){
                System.out.print("\t");
                j++;
            }

             int k=1;

            while (k <= 2*i - 1) {
               System.out.print(l+"\t");
               k++;
               l++;
            }
            System.out.println();
            i++;
        }

        sc.close();
    }
}
