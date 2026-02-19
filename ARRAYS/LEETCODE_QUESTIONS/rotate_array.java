public class rotate_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        reversal_algo(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reversal_algo(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // start n-k elm revrese
        rev(arr, 0, n - k - 1);
        // last ke k elm revrese
        rev(arr, n - k, n - 1);
        // al element revrese
        rev(arr, 0, n - 1);
    }

    public static void rev(int[] arr, int n, int k) {
        while (n < k) {
            int temp = arr[n];
            arr[n] = arr[k];
            arr[k] = temp;
            n++;
            k--;
        }
    }

    // public static void rotate(int[] arr, int k){ // time limit exceed 0(n^2)
    // int n= arr.length;
    // k = k%n;
    // for(int j=0; j<k; j++){
    // int item = arr[n-1];
    // for(int i=n-2;i>=0;i--){
    // arr[i+1]=arr[i];
    // }
    // arr[0]= item;
    // }
    // }
}
