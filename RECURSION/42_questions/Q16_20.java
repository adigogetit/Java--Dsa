public class Q16_20 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,9,7,6,5,7,6};
        int item = 7;
        System.out.println(solve(0,arr,item));

        System.out.println(solve1(10,arr,7));  

        prt(0,arr);

        even(0,arr);

        String s = "aditya";
        int c = 0;
        vowles(s,c,0);
        
    }

    // Q-16
    // first occurance
    public static int solve(int i,int[] arr,int item){
        if(i == arr.length)return -1;
        if(arr[i]==item){
            return i;
        }
        return solve(i+1,arr,item);
    }   

    // Q-17
    // Last occurance
    public static int solve1(int i,int[] arr,int item){
        if(i == 0)return -1;
        if(arr[i]==item){
            return i;
        }
        return solve(i-1,arr,item);
    }  
    
    // Q-18
    // print array elements
    public static void prt(int i, int[] arr){
        if(i == arr.length-1){
            System.out.print(arr[i]);
            return;
        }
        System.out.print(arr[i]);
        prt(i+1,arr);
        return;
    }

    // Q-19
    // count even numbers
    static int count = 0;
    public static void even(int i, int[] arr){
        if(i== arr.length){
            System.out.println(count);
            return;
        }
        if(arr[i]%2==0){
            count++;
        }
        even(i+1,arr);
        return;
    }

    // Q-20
    // count vowels

    public static boolean ans(String s,int i){
        char ch = s.charAt(i);
        if(ch == 'a' || ch == 'e' || ch =='i'|| ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public static void vowles(String s , int c, int i){
        if(i == s.length()){
            System.out.println(c);
            return;
        }
        if(ans(s,i)){
            c++;
        }
        vowles(s, c, i+1);
    }

}
