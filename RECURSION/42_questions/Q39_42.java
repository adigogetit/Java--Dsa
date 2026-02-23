public class Q39_42 {
    public static void main(String[] args) {

        con("code", 0);

        removeX("adixtyxa", 0, "");

        sum(123456,0);

        dig("123a45", 0);
    }

    // Q-39
    // Count consonants
    static int count;

    public static void con(String s, int i){
        if(i == s.length()){
            System.out.println(count);
            return;
        }
        char ch = s.charAt(i);
        if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
            count++;
        }

        con(s, i + 1);
    }

    // Q-40
    // Remove character x
    public static void removeX(String s, int i, String result) {
        if(i == s.length()){
            System.out.println(result);
            return;
        }
        if(s.charAt(i) != 'x') removeX(s,i+1,result+s.charAt(i));
        else removeX(s,i+1,result);
    }

    // Q-41
    // Sum of alternate digits
    static int sum;
    public static void sum(int n, int i){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        if(i%2 == 0){
            sum = sum + n % 10;
        }
        sum(n/10,i+1);
    }

    // Q-42
    // Check string contains only digits
    public static void dig(String s, int i) {
        if(i == s.length()){
            System.out.println("true");
            return;
        }
        if(s.charAt(i) > '0' && s.charAt(i) < '9'){
            dig(s, i + 1);
        }else{
            System.out.println("false");
            return;
        }
    }

}
