public class c {
    public static void main(String[] args) {
        int a=3;
        int n=5;
        System.out.println(pow(a,n));
        System.out.println(sum(n));
        sum1(n);
        sum2(n);
        System.out.println(fact(n,1));
        

    }

    // pow of a power n
    public static int pow(int a, int n){
        if(n==0){
            return 1;
        }
        int ans = a * pow(a,n-1);
        return ans;
    }

    // sum of n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ans = n + sum(n-1);
        return ans;
    }

    //  n to 1 tail recursion
    public static void sum1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        sum1(n-1);  
    }
    // 1 to n  head recursion
    public static void sum2(int n){
        if(n==0){
            return;
        }
        sum2(n-1);
        System.out.println(n);
    }

    // fact using tail recursion
    public static int fact(int n , int ans){
        if(n==0){
            return ans;
        }
        return fact(n-1,ans*n);
    }
    
}
