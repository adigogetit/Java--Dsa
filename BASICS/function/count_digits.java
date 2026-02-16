import java.util.*;
public class count_digits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int tar = sc.nextInt();

        System.out.println(count(num,tar));
    }

    public static int count (int num , int tar){

        int count = 0;

        while (num>0) {
            int d = num % 10 ;
            if (d==tar) {
                count++;
            }
            num = num/10;

        }return count;
    }
}