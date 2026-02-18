import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;
        while(i<=n){

            int j=1;
            while (j<=n-i) {
                System.out.print("\t");
                j++;
            }
            int k=1;
            int num =i;
            while (k<=i) {
                System.out.print(num+"\t");
                k++;
                num++;
            }
            int l=1;
            num = num-2;
            while (l<=i-1) {
                System.out.print(num+"\t");
                l++;
                num--;
            }
            System.out.println();
            i++;
        }
    }
}