import java.util.*;
public class Armstrong {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;

		System.out.println(arm(n,num));

    }

	public static int count(int n){
		int c=0;
		while(n>0){
			c++;
			n = n/10;
		}
		return c;
	}

	public static boolean arm(int n ,int num){
		int c = count(n);

		int sum=0;
		while(n>0){
			int rem = n%10;
			sum = sum + (int)Math.pow(rem,c);
			n = n/10;
		}
		if(sum == num) return true;
		else return false;
	}
}