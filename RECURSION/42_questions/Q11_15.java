public class Q11_15 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4};
        int m = Integer.MIN_VALUE;
        max(arr,0,m);

        int n =Integer.MAX_VALUE;
        min(arr,0,n);

        sum(arr,0,0);

        int[] brr = {1,2,7,3,4,5};
        sort(brr,0);

        int[] crr = {1,2,3,4,4,4,5,6};
        int key = 4;
        count(crr,0,0,key);

        
    }

    // Q-11
    // Maximum element in array
    public static void max(int[] arr,int i,int m){
        if(i == arr.length){
            System.out.println(m);
            return;
        }
        if(arr[i]>m){
            m = arr[i];
        }
        max(arr,i+1,m);
    }

    // Q-12
    // Min element in array
    public static void min(int[] arr,int i,int n){
        if(i == arr.length){
            System.out.println(n);
            return;
        }
        if(arr[i]<n){
            n = arr[i];
        }
        min(arr,i+1,n);
    }

    // Q-13
    // sum of element in array
    public static void sum(int[] arr,int i,int s){
        if(i == arr.length){
            System.out.println(s);
            return;
        }
        s = s + arr[i];
        sum(arr,i+1,s);
    }

    // Q-14
    // Array sorted
    public static void sort(int[] arr,int i){
        if(i == arr.length-1){
            System.out.println("True");
            return;
        }
        if(arr[i+1] >arr[i]){
            sort(arr,i+1);
        }else{
            System.out.println("False");
        }
    }

    // Q-15
    // count occurrence
    public static void count(int[] arr,int i, int c,int key){
        if(i == arr.length){
            System.out.println(c);
            return;
        }
        if(arr[i]==key){
            c++;
        }
        count(arr,i+1,c,key);
    }


}
