public class Q34_38 {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 3, 4, 5, 3, 4, 4, 4, 4, 3 };
        idx(arr, 0, 3);

        inc(arr, 0);

        rev(arr,0);

        System.out.println();
        small(495367495);

        large(495367495);

    }

    // Q-34
    // Print all indexes
    public static void idx(int[] arr, int i, int key) {
        if(i == arr.length) {
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        idx(arr, i + 1, key);
    }

    // Q-35
    // Check strictly increasing
    public static void inc(int[] arr, int i) {
        if(i == arr.length - 1){
            System.out.println("true");
            return;
        }
        if(arr[i] >= arr[i + 1]){
            System.out.println("false");
            return;
        }
        inc(arr, i + 1);
    }

    // Q-36
    // Print array in reverse
    public static void rev(int[] arr, int i) {
        if(i == arr.length){
            return;
        }
        rev(arr,i+1);
        System.out.print(arr[i]+" ");
    }

    // Q-37
    // Smallest digit
    static int min = Integer.MAX_VALUE;
    public static void small(int n){
        if(n == 0){
            System.out.println(min);
            return;
        }
        int d = n % 10;
        min = Math.min(d,min);
        small(n/10);
    }

    // Q-38
    // largest digit
    static int max = Integer.MIN_VALUE;
    public static void large(int n){
        if(n == 0){
            System.out.println(max);
            return;
        }
        int d = n % 10;
        max = Math.max(d,max);
        large(n/10);
    }


}
