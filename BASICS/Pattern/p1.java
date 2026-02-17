import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number - ");
        int n = sc.nextInt();

        // SQUARE
        int i=1;
        while (i<=n) {

            int j=1;
            while(j<=n){
                System.out.print("* ");
                j++;
            }

            i++;
            System.out.println();  
        }
        sc.close();
    }
}
