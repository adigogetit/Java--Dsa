import java.util.Scanner;

public class pascal_traingel{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        
        int i=0;
        while(i<n){
            int ncr=1;

            int j=0;
            while(j<=i){
                System.out.print(ncr+"");
                ncr=((i-j)*ncr)/(j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}