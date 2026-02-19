public class a {
//  max sum of window k
    public static void main(String[] args) {
        
        int[] arr={2,3,4,6,7,1,8,2,3,4};
        int k=3;

        System.out.println(max_sum(arr,k));

    }

    public static int max_sum(int[] arr, int k){
        int ans =0;
        int sum =0;

        for(int i=0; i<k; i++){
            sum = sum + arr[i];   // 1st window ans
        }
        ans = sum;

        for(int i=k; i<arr.length; i++){
            sum = sum + arr[i]; // window grow
            sum = sum-arr[i-k]; // window shrink
            ans = Math.max(ans,sum);  // calculate ans
        }
        return ans;
    }
}
