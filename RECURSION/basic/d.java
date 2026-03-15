public class d {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,9};
        int item = 10;
        System.out.print(solve(0,arr,item));
        System.out.print(sort(1,arr));
    }

    // first occurance
    public static int solve(int i,int[] arr,int item){
        if(i == arr.length)return -1;
        if(arr[i]==item){
            return i;
        }
        return solve(i+1,arr,item);
    }

    // array sorted aur not 
    public static boolean sort(int i,int[] arr){
        if(i==arr.length-1)return true;
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sort(i+1,arr);
    }
}
