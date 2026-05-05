public class All_Subarray_sum {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7};

        // freq * array index
        int n = arr.length;
        for(int i=0 ;i<n; i++){
            arr[i] = (i+1) * (n-i) * arr[i];
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
