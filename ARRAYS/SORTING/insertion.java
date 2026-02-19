public class insertion {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,6,2,5};
        insertion(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertion(int[] arr){
        for(int i=0; i<arr.length; i++){
            insertion_1(arr, i);
        }
    }
    public static void insertion_1(int[] arr , int i){

        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j] >item ){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
}
