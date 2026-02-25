public class permutation2 {
    public static void main(String[] args){
        String ques = "abca";
        ans(ques,"");
    }
    public static void ans(String ques,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            if(!char_is(ques,ch,i+1)){
                String s1 = ques.substring(0,i);
                String s2 = ques.substring(i+1);
    
                ans(s1+s2, ans+ch);
            }
        }
    }

    public static boolean char_is(String str, char ch, int idx){
        for(int i=idx; i<str.length(); i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
 