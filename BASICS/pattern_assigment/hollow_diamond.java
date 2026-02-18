import java.util.Scanner;

public class hollow_diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int n = st/2+1;
        int i=1;
        while(i<=n){

            int j=1;
            while (j<=n-i+1) {
                System.out.print("*\t");
                j++;
            }
            
            int k=1;
            while(k<=i*2-3){
                System.out.print(" \t");
                k++;
            }
            int l=1;
            while (l<=(i==1?n-i:n-i+1)) {
                System.out.print("*\t");
                l++;
            }
            System.out.println();
            i++;
        }

        int o=2;
        while(o<=n){

            int j=1;
            while (j<=o) {
                System.out.print("*\t");
                j++;
            }
            
            int k=1;
            while(k<=((n-o)*2)-1){
                System.out.print(" \t");
                k++;
            }

            int l=1;
            while (l<=(o==n?o-1:o)) {
                System.out.print("*\t");
                l++;
            }

            System.out.println();
            o++;
        }
    }
    
}
