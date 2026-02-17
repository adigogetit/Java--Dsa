import java.util.Scanner;

public class p0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number - ");
        int n = sc.nextInt();

        // SINGEL LINE STAR
        int i=1;
        while(i<=n){
            System.out.print("* ");
            i++;
        }

        sc.close();
    }
}
