public class traping_rain_water {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rain(height));
    }

    public static int rain(int[] height){

        int n = height.length;
        int[] left = new int[n];
        left[0] = height[0];
        for(int i=1; i<n; i++){
            left[i]=Math.max(height[i],left[i-1]);
        }

        int[] right = new int[n];
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            right[i]=Math.max(height[i],right[i+1]);
        }

        int width = 1;
        int sum = 0;
        int trapped_water = 0;

        for(int i=0;i<n;i++){
            trapped_water = Math.min(left[i],right[i]);
            sum = sum + (trapped_water - height[i])*width;
        }
        return sum;
    }
}
