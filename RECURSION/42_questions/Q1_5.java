public class Q1_5 {
    public static void main(String[] args) {
        // sum1(5);

        // sum2(5);

        // sum3(5);

        // fact(5);
        
        // int s;
        // sumDigit(163,0);
        
    }

    // Q-1
    //  n to 1 tail recursion
    public static void sum1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        sum1(n-1);  
    }

    // Q-2
    // 1 to n  head recursion
    public static void sum2(int n){
        if(n==0){
            return;
        } 
        sum2(n-1);
        System.out.println(n);
    }

    // Q-3
    // sum of n natural numbers
    public static int sum3(int n){
        if(n==1){
            return 1;
        }
        int ans = n + sum3(n-1);
        return ans;
    }

    // Q-4
    // factorial of n 
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int ans = n * fact(n-1);
        return ans;
    }

    // Q-5
    // Sum of digit
    public static void sumDigit(int n, int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        int d = n%10;
        s = s + d;
        sumDigit(n/10,s);
    }

}
