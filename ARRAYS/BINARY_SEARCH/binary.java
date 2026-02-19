public class binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int tar = 8;
        System.out.print(bin(arr,tar));

    }

    public static int bin(int arr[] , int tar){

        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(arr[mid] == tar){
                return mid;
            }
            if(arr[mid]>tar){
                j = mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}
