public class subsequesnces {
    public static void main(String[] args) {
        String ques = "abc";
        // print(ques,"");

        System.out.print("\n" + print(ques,""));
    }

    // print solutions
    // public static void print(String ques, String ans){
    //     if(ques.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     char ch = ques.charAt(0);

    //     // not pick
    //     print(ques.substring(1),ans);

    //     // pick
    //     print(ques.substring(1),ans+ch);
    // }

    
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
}
