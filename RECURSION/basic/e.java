public class e {
    public static void main(String[] args) {
        String s = "cat";
        solve(s,"");
    }

// Q31. Replace character
// Example:
// Input: "cat", a → o
// Output: "cot"
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
