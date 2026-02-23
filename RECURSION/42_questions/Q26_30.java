public class Q26_30 {
    public static void main(String[] args) {

        zero("10012500", 0);

        dectobin(5);

        System.out.println();
        System.out.println(pali("madam", 0));

        len("aditya",0);

    }

    // Q-26
    // count zeros
    static int count = 0;

    public static void zero(String a, int i) {
        if (i == a.length()) {
            System.out.println(count);
            return;
        }
        if (a.charAt(i) == '0') {
            count++;
        }
        zero(a, i + 1);

    }

    // Q-28
    // dec to bin
    public static void dectobin(int n) {
        if (n == 0) {
            return;
        }
        dectobin(n / 2);
        System.out.print(n % 2);
    }

    // Q-29
    // string palindrome
    public static boolean pali(String s, int i){
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return pali(s,i+1);
    }

    // Q-30
    // length of the string 
    static int c = 0;
    public static void len(String s , int i){
        if(i == s.length()){
            System.out.println(c);
            return;
        }
        c++;
        len(s, i+1);
    }


}
