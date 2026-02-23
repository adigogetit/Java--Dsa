public class Q31_33 {
    public static void main(String[] args) {
        String s = "cat";
        solve(s,"");
    }

    // Q-31
    // replace char o-->a
    public static void solve(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            solve(s.substring(1) , ans+'o');
        }else{
            solve(s.substring(1), ans+ch);
        }
    }


}
