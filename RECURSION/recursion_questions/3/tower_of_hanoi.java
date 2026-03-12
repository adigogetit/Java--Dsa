public class tower_of_hanoi {
    public static void main(String[] args){
        int n = 4;
        ans(n,"A","B","C");
    }
    public static void ans(int n, String src, String hlp, String des){
        if(n==0)return;
        
        ans(n-1, src, des, hlp);
        System.out.println("Move "+ n +"th disk fromc "+ src +" to "+ des);
        ans(n-1, hlp, src, des);
    }
}
