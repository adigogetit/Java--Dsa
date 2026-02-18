import java.util.Scanner;

public class double_side_arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st =n/2+1;

        int i=1;
        while (i<=st) {

            int j=1;
            while (j<=st-i) {
                System.out.print("    ");
                j++;
            }

            int k=1;
            int num=i;
            while (k<=i) {
                System.out.print(" "+num);
                num--;
                k++;
            }

            int l=1;
            while (l<=(i-1)*2-1) {
                System.out.print("  ");
                l++;
            }

            int m=1;
            while (m<=(i!=1?i:i-1)) {
                System.out.print(" "+m);
                
                m++;
            }

            System.out.println();
            i++;
        }

        int ft=n/2;
        int o=1;
        while (o<=ft) {

            int j=1;
            while (j<=o) {
                System.out.print("    ");
                j++;
            }

            int k=1;
            int mum = ft-o+1;
            while (k<=ft-o+1) {
                System.out.print(" "+mum);
                k++;
                mum--;
            }

            int l=1;
            while (l<=(ft-o)*2-1) {
                System.out.print("  ");
                l++;
            }

            int m=1;
            while (m<=(o!=ft?ft-o+1:o-ft)) {
                System.out.print(" "+m);
                m++;
            }

            System.out.println();
            o++;
        }
    }
}
