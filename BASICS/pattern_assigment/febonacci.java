import java.util.Scanner;

public class febonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a=0;
        int b=1;
        
        int i = 1;
        while(i<=n){
            
            int j=1;
            while(j<=i){
                System.out.print(a + "\t");
                int temp = a + b;
                a = b;
                b = temp;
                j++;
                
            }
            System.out.println();
            i++;
        }
    }
}