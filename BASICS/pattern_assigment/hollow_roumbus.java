import java.util.Scanner;

public class hollow_roumbus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i=1;
        while(i<=n){

            int k=1;
            while(k<=n-i){
                System.out.print(" ");
                k++;
            }

            int j=1;
            while(j<=n){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
