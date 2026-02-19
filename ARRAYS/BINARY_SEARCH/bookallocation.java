import java.util.Arrays;
import java.util.Scanner;

public class bookallocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int a = 0;
        while(t>a){
            int nob = sc.nextInt();
            int nos = sc.nextInt();
    
            int[] page = new int[nob];
            for(int i=0; i<nob; i++){
                page[i] = sc.nextInt();
            }

    
            System.out.println(mindis(page,nos));

            a++;
        }
    }


    public static int mindis(int[] page, int nob){
        int n=page.length;
        
        int st= 0;
        int end = 0;
        for(int i=0; i<n; i++){
            end = end + page[i];
        }

        int ans = 0;
        
        while(st<=end){
            int mid = st+(end-st)/2;
            
            if(isPossible(page,nob,mid)){
                ans=mid;
                end=mid-1;  // changes is here
            }else{
                st=mid+1;   // and here
            }
        }
        return ans;
    }


    public static boolean isPossible(int[] page, int nos, int mid){
        int stu=1;
        int readpage = 0;
        int n = page.length;

        for(int i=0; i<n;){
            if(readpage + page[i] <= mid){
                readpage = readpage + page[i];
                i++;
            }else{
                stu++;
                readpage = page[i];
            }
            if(stu > nos) return false;
            
        }
        return true;
    }
}
