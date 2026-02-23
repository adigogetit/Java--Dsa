public class Q21_25 {
    public static void main(String[] args) {

        prime(72, 2);

        gcd(12,18);

        lcm(4,6);
        
        even(1234);

        zero("1010",0,"");
    }

    // Q-21
    // check prime
    public static void prime(int n , int i){
        if(i == n){
            System.out.println("true");
            return;
        }
        if(n%i == 0){
            System.out.println("false");
            return;
        }
        prime(n,i+1);
    }

    // Q-22
    // GCD
    static int gcdr = 0;
    public static void gcd(int a , int b){
        if(b == 0){
            System.out.println(a);
            gcdr =a;
            return;
        }
        gcd(b , a%b);
    }
    
    // Q-23
    // Lcm
    public static void lcm(int a , int b){
        gcd(a,b);
        int lcm = a*b/gcdr;
        System.out.println(lcm);

    }

    // Q-24
    // sum of even digits
    static int s=0;
    public static void even(int n){
        if(n==0){
            System.out.println(s);
            return;
        }
        int d = n%10;
        if(d%2==0){
            s = s + d;
        }
        even(n/10);
    }

    // Q-25
    // remove zero from number
    public static void zero(String a, int i, String s){
        if(i == a.length()){
            System.out.println(s);
            return;
        }
        if(a.charAt(i) =='0'){
            zero(a,i+1,s);
        }else{
            zero(a,i+1,s+a.charAt(i));
        }
    }

    
}
