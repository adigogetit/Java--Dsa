public class kth_root {
    public static void main(String[] args) {
        int n= 149;
        int k = 3;
        System.out.print(bin(n,k));

    }
    // x^k=n   x^3=149   x=5

    public static int bin(int n , int k){

        int i=1;
        int j=n;
        int ans =0;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(Math.pow(mid,k)<=n){
                ans = mid;
                i=mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
}

