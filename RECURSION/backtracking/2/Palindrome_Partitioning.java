public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        Solve(ques, "");
    }

    public static void Solve(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0, cut);
            if (isPalindrome(s)) {
                Solve(ques.substring(cut), ans + s + "|");
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
