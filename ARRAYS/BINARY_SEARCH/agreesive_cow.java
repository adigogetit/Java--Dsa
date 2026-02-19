import java.util.Arrays;
import java.util.Scanner;

public class agreesive_cow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int a = 0;
        while(t<a){
            int stall = sc.nextInt();
            int cows = sc.nextInt();
    
            int[] arr = new int[stall];
            for(int i=0; i<stall; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
    
            System.out.println(maxdis(arr,cows));

            a++;
        }
    }

    public static int maxdis(int[] arr, int cow){
        int n=arr.length;
        
        int st=1;
        int end = arr[n-1]-arr[0];
        int ans = 0;
        
        while(st<=end){
            int mid = st+(end-st)/2;
            
            if(isPossible(arr,cow,mid)){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int cows, int mid){
        int cow_count=1;
        int lastcow = arr[0];
        int n = arr.length;

        for(int i=1; i<n; i++){
            if(arr[i] - lastcow >= mid){
                cow_count++;
                lastcow = arr[i];
            }
            if(cows == cow_count) return true;
        }
        return false;
    }
}
