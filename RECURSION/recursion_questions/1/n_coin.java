public class n_coin {
    public static void main(String[] args) {
        // coin(3,"");
        coin1(3,"");
    }

    // all combinations are allowed
    public static void coin(int n , String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        coin(n-1,s+"H");
        coin(n-1,s+"T");
    }
    
    // consicutive head not allowed
    public static void coin1(int n , String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1) != 'H'){
            coin1(n-1,s+"H");
        }
        coin1(n-1,s+"T");
    }
}
