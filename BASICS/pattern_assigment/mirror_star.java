import java.util.Scanner;

public class mirror_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();

        int n = st/2+1;
        int i =1;
        while (i<=n) {

            int j=1;
            while (j<=n-i) {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while (k<=2*i-1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        int o =2;
        while (o<=n) {

            int j=1;
            while (j<=o-1) {
                System.out.print(" ");
                j++;
            }
            int k=1;
            while (k<=2*(n-o)+1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            o++;
        }
    }
}
