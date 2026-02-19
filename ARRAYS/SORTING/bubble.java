public class bubble {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};

        bubble_sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble_sort(int[] arr){
        int  n = arr.length;

        for(int turn=0; turn<n-1; turn++){
            for(int i=0; i<n-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        
    }
}
