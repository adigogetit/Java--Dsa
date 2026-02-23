
public class b {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println(fab(n));
    }

    // factorial of n 
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int ans = n * fact(n-1);
        return ans;
    }

    // nth term in febonacci
    public static int fab(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int ans = fab(n-1)+fab(n-2);
        return ans;
    }

}

