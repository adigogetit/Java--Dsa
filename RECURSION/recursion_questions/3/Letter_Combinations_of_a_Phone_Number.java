public class Letter_Combinations_of_a_Phone_Number {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args){
        String ques = "23";
        ans(ques,"");
    }
    public static void ans(String ques,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);//2-->50
        String get = key[ch-'0'];//50-48-->[2]-->abc

        for(int i=0; i<get.length(); i++){
            ans(ques.substring(1), ans+get.charAt(i));
        }
    }
}
