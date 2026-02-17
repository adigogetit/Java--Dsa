import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int i=1;
       while(i<=n){

        int j=1;
        int mid= n/2;

        int k =1;
        while (k<=mid-i) {
            System.out.print("  ");
            k++;
        }
        if(i<=mid){
            while(j<=(mid>=i?i:n-i)){
                System.out.print(" *");
                j++;
            }
        }else{
            int l=1;
            while(l<=i-mid){
                System.out.print("  ");
                l++;
            }
                while(j<=(mid>=i?i:n-i)){
                    System.out.print(" *");
                    j++;
                }
        }
    
        System.out.println();
        i++;
        }
        sc.close();
    }
}
