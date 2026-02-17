import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int i=1;
       while(i<=n){

        int j=1;
        int mid= n/2;
        while(j<=(mid>=i?i:n-i)){
            System.out.print(" *");
            j++;
        }
        System.out.println();
        i++;
        }
        sc.close();
    }
}
