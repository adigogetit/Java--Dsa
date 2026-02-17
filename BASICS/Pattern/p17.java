import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n= m/2;

        int i=1;
        while(i<=n){

            int j=1;
            while(j<=n-i+1){
                System.out.print(" *");
                j++;
            }
            
            int k=1;
            while(k<=(i*2-1)){
                System.out.print("  ");
                k++;
            }

            int l=1;
            while(l<=n-i+1){
                System.out.print(" *");
                l++;
            }
        
            System.out.println();
            i++;
        }
        System.out.println();

        int o=1;
        while(o<=n){

            int j=1;
            while(j<=o){
                System.out.print(" *");
                j++;
            }
            
            int k=1;
            while(k<= (n*2)-(o*2)+1){
                System.out.print("  ");
                k++;
            }

            int l=1;
            while(l<=o){
                System.out.print(" *");
                l++;
            }
        
            System.out.println();
            o++;
        }

        sc.close();
    }
}
