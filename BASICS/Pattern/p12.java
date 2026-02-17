import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  * ! * pattern
        
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=i*2-1){
                  if(k%2==0){
                    System.out.print("!");
                }
                else{
                    System.out.print("*");
                }
                k++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
