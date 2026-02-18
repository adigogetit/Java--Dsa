import java.util.Scanner;

public class hour_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int st = n + 1;

       
        int i = 1;
        while (i <= st) {
            int j = 1;
            while (j <= i - 1) {
                System.out.print("  ");
                j++;
            }

            int num = n - i + 1;
            int k = 1;
            while (k <= st - i) {
                System.out.print(num + " ");
                num--;
                k++;
            }

            System.out.print("0 ");

            num = 1;
            int l = 1;
            while (l <= st - i) {
                System.out.print(num + " ");
                num++;
                l++;
            }

            System.out.println();
            i++;
        }

        int o = n - 1;
        while (o >= 0) {
            int j = 1;
            while (j <= o) {
                System.out.print("  ");
                j++;
            }

            int num = n - o;
            int k = 1;
            while (k <= n - o) {
                System.out.print(num + " ");
                num--;
                k++;
            }

            System.out.print("0 ");

            num = 1;
            int l = 1;
            while (l <= n - o) {
                System.out.print(num + " ");
                num++;
                l++;
            }

            System.out.println();
            o--;
        }
    }
}