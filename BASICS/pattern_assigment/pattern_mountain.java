import java.util.Scanner;

public class pattern_mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=i) {
                System.out.print(j+"\t");
                j++;
            }
            int k=1;
            while (k<=(n-i)*2-1) {
                System.out.print("\t");
                k++;
            }

            int l=(i==n)?i-1:i;  
            while (l>=1) {
                System.out.print(l+"\t");
                l--;
            }

            System.out.println();
            i++;
        }
    }
}
