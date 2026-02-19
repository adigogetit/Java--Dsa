public class a {
    // find max consecuitive numbers which diff is less then 2
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10,11,12,14,15};

        int n = arr.length;
        int count=1;
        int max=0;

        for(int r=1;r<n;r++){
            if(arr[r] - arr[r-1]==1){
                count++;
            }
            else count=1;
            max = Math.max(max,count);
            

        }
        System.out.print(max);
    }
}
