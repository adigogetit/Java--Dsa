import java.util.Scanner;

public class Shopping {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        int phone =1;
        int a=0;
        int h=1;

        while(true){
            a=a+phone;
            if(a>m){
              System.out.println("h");
              break;
            }
            phone++;
            
            h=h+phone;
            if(h>n){
              System.out.println("a");
              break;
            }
            phone++;

        }
      }
      t--;
    }

}