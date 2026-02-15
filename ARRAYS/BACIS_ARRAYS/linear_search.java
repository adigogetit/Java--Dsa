public class linear_search {
    public static void main(String[] args) {
        // int[] arr = new int [] {1,2,3,4,5};   this is also a syntax
        int[] arr = {10,3,4,6,7,9};
        int tar = 6;

        System.out.println(search(arr,tar));

    }

    public static int search(int[] arr, int tar){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return 0;
    }
}
