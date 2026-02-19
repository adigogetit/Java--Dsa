
public class selection {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};

        Selection_sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Selection_sort(int[] arr){
        int  n = arr.length;

        for(int i=0; i<n-1; i++){
            int idx = 0;
            for(int j=0; j<n-1; j++){
                if(arr[i]<arr[i+1]){
                    idx = i; 
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        
    }
}
