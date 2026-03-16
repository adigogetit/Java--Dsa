public class subsequesnces {
    public static void main(String[] args) {
        String ques = "abc";
        // print(ques,"");
        print(ques,"");

        System.out.println();
        // using for loop
        solve(0,ques,"");
    }
    public static void print(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        // not pick
        print(ques.substring(1),ans);
        // pick
        print(ques.substring(1),ans+ch);
    }

    public static void solve(int start, String ques, String ans) {

        System.out.print(ans+" ");
            
        for (int i = start; i < ques.length(); i++) {
            solve(i + 1, ques, ans + ques.charAt(i));
        }
    }
}
