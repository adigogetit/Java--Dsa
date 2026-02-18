import java.util.Scanner;

public class hour_glass_inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st = n+1;

        int i=1;
        while (i<=st) {

            int num =n;
            int j=1;
            while (j<=i) {
                System.out.print(num+" ");
                j++;
                num--;
            }
            int k=1;
            while (k<=(st-i)*2-1) {
                System.out.print("  ");
                k++;
            }
            int l=1;
            if(i==st){
                num++;
            }
            while (l<=(i==st?i-1:i)) {
                num++;
                System.out.print(num+" ");
                l++;
            }
            System.out.println();
            i++;
        }

        int o =1;

        while (o<=n) {

            int j=1;
            int mum = n;
            while (j<=n-o+1) {
                System.out.print(mum+" ");
                j++;
                mum--;
            }

            int k=1;
            while (k<=2*o-1) {
                System.out.print("  ");
                k++;
            }


            int l=1;
            while (l<=n-o+1) {
                mum++;
                System.out.print(mum+" ");
                l++;
            }
            System.out.println();
            o++;
        }
    }
}
