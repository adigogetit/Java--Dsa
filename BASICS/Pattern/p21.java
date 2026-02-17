import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //    lower half diamond
        
        int n = sc.nextInt();

        int i=1;
        while(i<=n){
            
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            int k=1;
            while(k<=(((n-1)-i)*2)+1){
                System.out.print("  ");
                k++;
            }
            
            int l=1;
            while(l<=(i == n ? i - 1 : i)){
                    System.out.print("* ");
                l++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
