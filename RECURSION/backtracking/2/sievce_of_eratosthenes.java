public class sievce_of_eratosthenes {
    public static void main(String[] args) {
        int n = 120;
        System.out.println(Solve(n));
        
    }

    public static int Solve(int n){
        int[] prime = new int[n+1];
        prime[0] = 1;
        prime[1] = 1;

        for(int i=2; i*i <= n; i++){
            if(prime[i] == 0){
                for(int j = i*i; j <= n; j+=i){
                    prime[j] = 1;
                }
            }
        }

        int count = 0;
        for(int i=2; i<=n; i++){
            if(prime[i] == 0){
                count++;
            }
        }

        return count;
    }
}
