public class subsequesnces {
    public static void main(String[] args) {
        String ques = "abc";
        // print(ques,"");
        System.out.print("\n" + print(ques,""));

        System.out.println();
        // using for loop
        solve(0,ques,"");
    }
    // count solutions
    public static int print(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch = ques.charAt(0);
        // not pick
        int a1 = print(ques.substring(1),ans);
        // pick
        int a2 = print(ques.substring(1),ans+ch);
        return a1+a2;
    }

    public static void solve(int start, String ques, String ans) {

        System.out.print(ans+" ");
            
        for (int i = start; i < ques.length(); i++) {
            solve(i + 1, ques, ans + ques.charAt(i));
        }
    }
}
