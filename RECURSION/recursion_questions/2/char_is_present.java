public class char_is_present {
    public static void main(String[] args) {
        String str = "abcbhjaijai";
        char ch = 'a';
        int i = 2;
        System.out.println(ans(str,ch,i));
    }

    public static boolean ans(String str, char ch, int idx){
        for(int i=idx; i<str.length(); i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
