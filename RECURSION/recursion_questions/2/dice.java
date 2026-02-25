public class dice {
    public static void main(String[] args) {
        int n = 4;
        // dice(n,0,"");

        // dice1(n,0,"");

        // dice2(n,0,"");
        // System.out.println("\n"+count);

        System.out.println("\n" + dice3(n,0,""));
    }
    
    // using recursive calls
    public static void dice(int n, int curr, String ans){
        if(curr == n){
            System.out.println(ans);
            return;
        }
        if(curr > n)return;

        dice(n,curr+1,ans+1);
        dice(n,curr+2,ans+2);
        dice(n,curr+3,ans+3);
    }
    
    // using for loop
    public static void dice1(int n, int curr, String ans){
        if(curr == n){
            System.out.println(ans);
            return;
        }
        if(curr > n)return;

        for(int d=1; d<=3; d++){
            dice(n ,curr+d ,ans+d);
        }
    }
    
    // count 
    static int count = 0;
    public static void dice2(int n, int curr, String ans){
        if(curr == n){
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(curr > n)return;

        for(int d=1; d<=3; d++){
            dice2(n ,curr+d ,ans+d);
        }
    }

    // count another method
    public static int dice3(int n, int curr, String ans){
        if(curr == n){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr > n)return 0;
        int a = 0;
        for(int d=1; d<=3; d++){
            a += dice3(n ,curr+d ,ans+d);
        }
        return a;
    }

}
