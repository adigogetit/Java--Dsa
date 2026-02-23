public class Q6_10 {
    public static void main(String[] args) {
        // int ans=0;
        // count(12345,0);

        // int p;
        // pro(234,1);

        // int r;
        // rev(1234,0);

        // int a;
        // int n = 12321;
        // int temp =n;
        // pali(n,0,temp);

        System.out.println(pow(2,4));
        
    }

    // Q-6
    // Count digits
    public static void count(int n, int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        ans++;
        count(n/10,ans);
    }

    // Q-7
    // Product of digits
    public static void pro(int n, int p){
        if(n==0){
            System.out.println(p);
            return;
        }
        int d = n%10;
        p = p *d;
        pro(n/10,p);
    }

    // Q-8
    // reverse a number
    public static void rev(int n,int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        int d = n%10;
        r = r*10 + d;
        rev(n/10,r);
    }

    // Q-9
    // pailinderome
    public static void pali(int n,int a,int temp){
        if(n==0){
            if(a==temp){
                System.out.println("True");
            }else{
                System.out.println("Fasle");
            }
            return;
        }
        int d = n%10;
        a = a*10 + d;
        pali(n/10,a,temp);
    }

    // Q-10
    // pow of a power n
    public static int pow(int a, int n){
        if(n==0){
            return 1;
        }
        int ans = a * pow(a,n-1);
        return ans;
    }
    
}
