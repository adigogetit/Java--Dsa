import java.util.Scanner;

public class patter_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while (i<=n) {

            int j=1;
            while (j<=i) {
                System.out.print(j);
                j++;
            }
            int k=1;
            while (k<=(n*2-i*2-1)) {
                System.out.print(" ");
                k++;
            }
            int l = i - 1;
            while (l >= 1) {
                System.out.print(l);
                l--;
            }
            System.out.println();
            i++;
        }
    }
}
